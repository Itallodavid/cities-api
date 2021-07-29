package itallodavid.github.citiesapi.services;

import itallodavid.github.citiesapi.dto.UniqueValueResponseDTO;
import itallodavid.github.citiesapi.exceptions.EntityNotFoundException;
import itallodavid.github.citiesapi.models.Country;
import itallodavid.github.citiesapi.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class CountryService {
    private final CountryRepository repository;

    public Page<Country> getCountries(final Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Country getCountry(final Long id) throws EntityNotFoundException {
        Optional<Country> country = repository.findById(id);

        if (country.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return country.get();
    }

    public UniqueValueResponseDTO getCountryBacen(final Long countryId) {
        Country country = this.getCountry(countryId);
        return new UniqueValueResponseDTO(country.getBacen());
    }
}
