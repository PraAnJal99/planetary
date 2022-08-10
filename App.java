package assignment.PlanetaryData;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App 
{
	public static Planet[] planets;
	public static int countingMoons(Planet[] planets) {
		int count = 0;
		for(Planet p : planets) {
			if(p.isHasRings())
				count += p.getNumber_of_moons();
		}
		return count;
	}
	
	public static String maxGas(Planet[] planets) {
		String max = "";int count=0;
		HashMap<String,Integer> hs = new HashMap<>();
		for(Planet p : planets) {
			for(String g : p.getSurface_gasses()) {
				if(hs.containsKey(g))
					hs.put(g, hs.get(g)+1);
				else
					hs.put(g, 1);
			}
		}
		Iterator it = hs.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			if((int)me.getValue()>count) {
				count = (int)me.getValue();
				max = (String)me.getKey();
			}
		}
		return max;
		
	}
	
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        planets = new Planet[6];
        for(int i=0; i<6; i++) {
        	String name = sc.nextLine();
//        	Entering all the gases seperated by comma
        	String gases = sc.nextLine();
        	int moons = sc.nextInt();sc.nextLine();
        	boolean rings = sc.nextBoolean();sc.nextLine();
        	List<String> moonsList = Arrays.asList(gases.trim().split(","));
        	planets[i] = new Planet(name, moonsList, moons, rings);
        }
       System.out.println("Count of moons of all planets having rings : "+countingMoons(planets));
       System.out.println("Gas found in maximum planets : "+maxGas(planets));
    }
}
