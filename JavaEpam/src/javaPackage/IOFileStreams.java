package EpamPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class IOFileStreams 
{
	
	private static final String DIR="DIR";
	private static final String FILE="File";
	private static final String TAG="</td><td>";
	private static final String dateFromat="dd/MM/yyyy";

	public static void main(String[] args) throws IOException, ParseException 
	{
		listFilesAndFolders("D:\\FileStream");

	}
	
	public static void listFilesAndFolders(String directoryName) throws IOException, ParseException{
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();
        Map<String,List<String>> fileMap = new HashMap<String, List<String>>();
        List<String> rowList=new ArrayList<String>();
        long fileSize;
        int cntr=0;
        String fileType;
        
        for (File file : fList){
        	cntr++;
        	rowList.clear();
            BasicFileAttributes attributes = Files.readAttributes(Paths.get(file.toURI()), BasicFileAttributes.class);
            FileTime fileTime = attributes.creationTime();
            Date date = new Date(fileTime.toMillis());
            SimpleDateFormat sdf = new SimpleDateFormat();
            String dateWithoutTime = sdf.format(date);
            if (attributes.isDirectory()){
            	fileSize=getFolderSize(file);
            	fileType="DIR";
            }else{
            	fileType="FILE";
            	fileSize=file.length()/1024;
            }   
       	 	fileMap.put(Integer.toString(cntr),new ArrayList<String>());
       	 	fileMap.get(Integer.toString(cntr)).add(file.getName());
       	 	fileMap.get(Integer.toString(cntr)).add(dateWithoutTime);
       	 	fileMap.get(Integer.toString(cntr)).add(Long.toString(fileSize));
       	 	fileMap.get(Integer.toString(cntr)).add(fileType);	
        }
        createTable(fileMap);
   }
	
	public static void createTable(Map<String, List<String>> fileMap) throws IOException{
		   Set keys = fileMap.keySet(); 
	       StringBuilder buf = new StringBuilder();
	   	buf.append("<html>" +
	   	           "<body>" +
	   	           "<table border=1>" +
	   	           "<tr>" +
	   	           "<th>Name</th>" +
	   	           "<th>Type</th>" +
	   	           "<th>CreationDate</th>" +
	   	           "<th>Size (in Kb)</th>" +
	   	           "</tr>");
	   	 for (Iterator  fileCntr= keys.iterator(); fileCntr.hasNext(); ) {
	            String key = (String) fileCntr.next();
	             buf.append("<tr><td>");
	 	       	 buf.append(fileMap.get(key).get(0));
	 	       	 buf.append(TAG);
	 	       	 buf.append(fileMap.get(key).get(3));
	 	       	 buf.append(TAG);
	 	       	 buf.append(fileMap.get(key).get(1));
	 	       	 buf.append(TAG);
	 	       	 buf.append(fileMap.get(key).get(2));
		       	 buf.append("</td></tr>");
	   	 }
	   	 buf.append("</table>" +
	 	           "</body>" +
	 	           "</html>");
	   	 String html = buf.toString();
	   		WriteToFile(html,"FolderContent.html");
	       
	   }
	 
	    public static long getFolderSize(File dir) {
	        long size = 0;
	        if (!(dir.listFiles()==null)){
		        for (File file : dir.listFiles()) {
		            if (file.isFile()) {
		                size += file.length();
		            }
		            else
		                size += getFolderSize(file);
		        }
		    }
	        return size;
	    }
	  
	    public static void WriteToFile(String fileContent, String fileName) throws IOException {
	        String projectPath = System.getProperty("user.dir");
	        String tempFile = projectPath + File.separator+fileName;
	        File file = new File(tempFile);
	        if (file.exists()) {
	            try {
	                File newFileName = new File(projectPath + File.separator+ "bkp_"+fileName);
	                file.renameTo(newFileName);
	                file.createNewFile();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
	        Writer writer=new OutputStreamWriter(outputStream);
	        try{
		        writer.write(fileContent);
		        writer.close();
	        }catch (IOException e){
	        	System.out.println(e);
	        	writer.close();
	        }

	    }

}
