package itallodavid.github.citiesapi.services;

import itallodavid.github.citiesapi.models.State;
import itallodavid.github.citiesapi.repositories.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StateService {
    private final StateRepository repository;

    public Page<State> states(final Pageable pageable){
        return repository.findAll(pageable);
    }
}
