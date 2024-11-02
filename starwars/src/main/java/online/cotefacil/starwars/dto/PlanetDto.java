package online.cotefacil.starwars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.cotefacil.starwars.model.Planet;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanetDto {
    private String name;
    private String climate;
    private String terrain;
    private Long appearance;

    public PlanetDto(Planet planet) {
        this.name = planet.getName();
        this.climate = planet.getClimate();
        this.terrain = planet.getTerrain();
        this.appearance = planet.getAppearance();
    }

    public Planet toEntity() {
        Planet planet = new Planet();
        planet.setName(name);
        planet.setClimate(climate);
        planet.setTerrain(terrain);
        planet.setAppearance(appearance);
        return planet;
    }
}

