package online.cotefacil.starwars.model;

import javax.persistence.*;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Entity
@Table(name = "planets")
@Named
@SessionScoped
public class Planet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String climate;
    private String terrain;
    private int appearance;

    public Planet() {
    }

    public Planet(String planet, String climate, String terrain, int appearance) {
        this.name = planet;
        this.climate = climate;
        this.terrain = terrain;
        this.appearance = appearance;
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
