package EpamPackage;
import java.lang.reflect.Constructor;

public class Singleton {

	public static void main(String[] args)
	{
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

	}
	
	//Here is the implementation of static initialization singleton class
	
	public static class EagerInitializedSingleton {
	    
	    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton(){}

	    // In Singleton we should use GetInstance()
	    
	    public static EagerInitializedSingleton getInstance()
	    {
	    	
	   	        return instance;
	    }

}
}
