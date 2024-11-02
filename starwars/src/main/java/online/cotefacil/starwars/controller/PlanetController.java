package online.cotefacil.starwars.controller;

import online.cotefacil.starwars.dto.PlanetDto;
import online.cotefacil.starwars.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planets")
public class PlanetController {

    private final PlanetService planetService;

    @Autowired
    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @GetMapping
    public ResponseEntity<List<PlanetDto>> getAllPlanets() {
        List<PlanetDto> planets = planetService.getAllPlanets();
        return ResponseEntity.ok(planets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanetDto> getPlanetById(@PathVariable Long id) {
        return planetService.getPlanetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PlanetDto> addPlanet(@RequestBody PlanetDto PlanetDto) {
        PlanetDto createdPlanet = planetService.addPlanet(PlanetDto);
        return new ResponseEntity<>(createdPlanet, HttpStatus.CREATED);
    }
}
