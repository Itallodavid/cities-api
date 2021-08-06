package itallodavid.github.citiesapi.services;

import itallodavid.github.citiesapi.models.State;
import itallodavid.github.citiesapi.repositories.StateRepository;
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
class StateServiceTest {

    @Mock
    private StateRepository repository;

    @InjectMocks
    private StateService service;

    @Test
    public void whenTest(){
        // given
        Pageable pageable = Pageable.unpaged();
        Page<State> states = repository.findAll(pageable);

        // when
        when(repository.findAll(pageable)).thenReturn(states);

        // then
        Page<State> statePage = service.states(pageable);
        assertEquals(states, statePage);
    }
}