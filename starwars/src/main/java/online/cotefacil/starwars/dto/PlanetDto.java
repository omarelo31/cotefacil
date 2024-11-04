package online.cotefacil.starwars.dto;

import online.cotefacil.starwars.model.Planet;

public class PlanetDto {
    private String name;
    private String climate;
    private String terrain;
    private int appearance;

    public PlanetDto() {}

    public PlanetDto(Planet planet) {
        this.name = planet.getName();
        this.climate = planet.getClimate();
        this.terrain = planet.getTerrain();
        this.appearance = planet.getAppearance();
    }

    public PlanetDto(String name, String climate, String terrain, int appearance) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.appearance = appearance;
    }

    public Planet toEntity() {
        Planet planet = new Planet();
        planet.setName(name);
        planet.setClimate(climate);
        planet.setTerrain(terrain);
        planet.setAppearance(appearance);
        return planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }
}

