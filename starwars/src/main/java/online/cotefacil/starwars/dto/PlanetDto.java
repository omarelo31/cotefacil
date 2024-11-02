package online.cotefacil.starwars.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import online.cotefacil.starwars.model.Planet;

@NoArgsConstructor
@AllArgsConstructor
public class PlanetDto {
    private Long id;
    private String name;
    private String climate;
    private String terrain;
    private Long appearance;

    public PlanetDto(Planet planet) {
        this.id = planet.getId();
        this.name = planet.getName();
        this.climate = planet.getClimate();
        this.terrain = planet.getTerrain();
        this.appearance = planet.getAppearance();
    }

    public Planet toEntity() {
        return new Planet(id, name, climate, terrain, appearance);
    }
}

