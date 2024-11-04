package online.cotefacil.starwars.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.web.client.RestTemplate;

@Service
public class SwapiService {

    private static final String SWAPI_BASE_URL = "https://swapi.dev/api/planets/?search=";

    public int getFilmAppearance(String planetName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = SWAPI_BASE_URL + planetName;

        try {
            SwapiResponse response = restTemplate.getForObject(url, SwapiResponse.class);
            if (response != null && !response.getResults().isEmpty()) {
                return response.getResults().get(0).getFilms().size();
            }
        } catch (Exception e) {
            System.out.println("Error fetching data from SWAPI: " + e.getMessage());
        }
        return 0;
    }

    public static class SwapiResponse {
        private List<SwapiPlanet> results;

        public List<SwapiPlanet> getResults() {
            return results;
        }

        public void setResults(List<SwapiPlanet> results) {
            this.results = results;
        }
    }

    public static class SwapiPlanet {
        private List<String> films;

        public List<String> getFilms() {
            return films;
        }

        public void setFilms(List<String> films) {
            this.films = films;
        }
    }
}
