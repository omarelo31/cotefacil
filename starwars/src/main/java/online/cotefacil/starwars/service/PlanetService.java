package online.cotefacil.starwars.service;

import online.cotefacil.starwars.dto.PlanetDto;
import online.cotefacil.starwars.model.Planet;
import online.cotefacil.starwars.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanetService {
    private final PlanetRepository planetRepository;

    @Autowired
    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public List<PlanetDto> getAllPlanets() {
        return planetRepository.findAll()
                .stream()
                .map(PlanetDto::new)
                .collect(Collectors.toList());
    }
}
