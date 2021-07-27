package itallodavid.github.citiesapi.services;

import itallodavid.github.citiesapi.models.Country;
import itallodavid.github.citiesapi.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CountryService {
    private final CountryRepository repository;

    @Transactional(readOnly = true)
    public Page<Country> getCountries(final Pageable pageable) {
        return repository.findAll(pageable);
    }
}
