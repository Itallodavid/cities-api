package itallodavid.github.citiesapi.services;

import itallodavid.github.citiesapi.exceptions.EntityNotFoundException;
import itallodavid.github.citiesapi.models.State;
import itallodavid.github.citiesapi.repositories.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class StateService {
    private final StateRepository repository;

    public Page<State> states(final Pageable pageable){
        return repository.findAll(pageable);
    }

    public State getState(final Long id){
        Optional<State> state = repository.findById(id);
        if(state.isEmpty()){
            throw new EntityNotFoundException();
        }
        return state.get();
    }

    public List<Integer> stateDDD(final Long id) throws EntityNotFoundException {
        State state = this.getState(id);
        return state.getDdd();
    }
}
