package itallodavid.github.citiesapi.controllers;

import itallodavid.github.citiesapi.models.Country;
import itallodavid.github.citiesapi.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("countries")
@AllArgsConstructor
public class CountryController {

    private final CountryService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Page<Country> allCountries(final Pageable pageable) {
        return service.getCountries(pageable);
    }
}
