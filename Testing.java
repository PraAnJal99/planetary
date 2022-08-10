package assignment.PlanetaryData;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class Testing{
	
	public Planet[] createPlanetData() {
		Planet[] planets = new Planet[6];
		planets[0] = new Planet("Mercury", new ArrayList<>(), 0, false);
		planets[1] = new Planet("Venus", Arrays.asList("Carbon Dioxide","Nitrogen"), 0, false);
		planets[2] = new Planet("Earth", Arrays.asList("Oxygen","Nitrogen"), 1, false);
		planets[3] = new Planet("Mars", Arrays.asList("Helium","Hydrogen"), 79, true);
		planets[4] = new Planet("Jupitor", Arrays.asList("Helium","Hydrogen"), 83, true);
		planets[5] = new Planet("Uranus", Arrays.asList("Helium","Hydrogen","Methane"), 27, true);
		return planets;
	}
	
	@Test
	public void checkcountMoons() {
		assertEquals(App.countingMoons(createPlanetData()), 189);
	}
	
	@Test
	public void checkMaxgas() {
		assertEquals(App.maxGas(createPlanetData()), "Hydrogen");
	}
	
}
