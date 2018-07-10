package practice;

import java.util.HashSet;
import java.util.Set;


public class HeavenlyBodies
{

	    private final String name;
	    private final double orbitalPeriod;
	    private final Set<HeavenlyBodies> satellites;

	/*public static void main(String[] args) 
	{
	}*/
	    
	    public HeavenlyBodies(String name, double orbitalPeriod) 
	    {
	        this.name = name;
	        this.orbitalPeriod = orbitalPeriod;
	        this.satellites = new HashSet<>();
	    }

	    public String getName() 
	    {
	        return name;
	    }

	    public double getOrbitalPeriod() 
	    {
	        return orbitalPeriod;
	    }

	    public boolean addMoon(HeavenlyBodies moon)
	    {
	        return this.satellites.add(moon);
	    }

	    public Set<HeavenlyBodies> getSatellites() 
	    {
	        return new HashSet<>(this.satellites);
	    }


	    
	    // code updated by Dilip
	    @Override
        public int hashCode()
        {
            System.out.println("hashcode called");
            int hashcode = 0;
           hashcode += orbitalPeriod;
            return hashcode;
        }
         
        @Override
        public boolean equals(Object obj)
        {
            System.out.println("In equals");
            if (obj instanceof Price) {
            	HeavenlyBodies pp = (HeavenlyBodies) obj;
                return (pp.name.equals(this.name) && pp.orbitalPeriod == this.orbitalPeriod);
            } else {
                return false;
            }
        }
        
        //end of code updated by Dilip
}
