package itallodavid.github.citiesapi.controllers;

import itallodavid.github.citiesapi.dto.UniqueValueResponseDTO;
import itallodavid.github.citiesapi.exceptions.EntityNotFoundException;
import itallodavid.github.citiesapi.models.Country;
import itallodavid.github.citiesapi.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("countries")
@AllArgsConstructor
public class CountryController {

    private final CountryService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Page<Country> allCountries(final Pageable pageable) {
        return service.getCountries(pageable);
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Country> getCountry(@PathVariable Long id) throws EntityNotFoundException {
        return ResponseEntity.ok(service.getCountry(id));
    }

    @GetMapping(value = "/{id}/bacen", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UniqueValueResponseDTO> getCountryBacen(@PathVariable Long id) throws EntityNotFoundException {
        return ResponseEntity.ok(service.getCountryBacen(id));
    }
}
