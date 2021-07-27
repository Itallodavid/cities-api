package itallodavid.github.citiesapi.services;

import itallodavid.github.citiesapi.models.Country;
import itallodavid.github.citiesapi.repositories.CountryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CountryServiceTest {

    @Mock
    private CountryRepository repository;

    @InjectMocks
    private CountryService service;

    @Test
    public void whenTest(){
        // given
        Pageable pageable = Pageable.unpaged();
        Page<Country> page = repository.findAll(pageable);

        // when
        when(repository.findAll(pageable)).thenReturn(page);

        // then
        Page<Country> countryPage = service.getCountries(pageable);
        assertEquals(page, countryPage);
    }
}