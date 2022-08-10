package assignment.PlanetaryData;

import java.util.List;


public class Planet {
	private String planet_name;
	private List<String> surface_gasses;
	private int number_of_moons;
	private boolean hasRings;
	public String getPlanet_name() {
		return planet_name;
	}
	public void setPlanet_name(String planet_name) {
		this.planet_name = planet_name;
	}
	public List<String> getSurface_gasses() {
		return surface_gasses;
	}
	public void setSurface_gasses(List<String> surface_gasses) {
		this.surface_gasses = surface_gasses;
	}
	public int getNumber_of_moons() {
		return number_of_moons;
	}
	public void setNumber_of_moons(int number_of_moons) {
		this.number_of_moons = number_of_moons;
	}
	public boolean isHasRings() {
		return hasRings;
	}
	public void setHasRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
	public Planet(String planet_name, List<String> surface_gasses, int number_of_moons, boolean hasRings) {
		super();
		this.planet_name = planet_name;
		this.surface_gasses = surface_gasses;
		this.number_of_moons = number_of_moons;
		this.hasRings = hasRings;
	}
	
}
