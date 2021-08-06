package itallodavid.github.citiesapi.controllers;

import itallodavid.github.citiesapi.exceptions.EntityNotFoundException;
import itallodavid.github.citiesapi.models.State;
import itallodavid.github.citiesapi.services.StateService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/states")
@AllArgsConstructor
public class StateController {
    private final StateService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<State> states(final Pageable pageable){
        return service.states(pageable);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public State getState(final @PathVariable Long id) throws EntityNotFoundException{
        return service.getState(id);
    }

    @GetMapping( path = "/{id}/ddd" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> stateDDD(final @PathVariable Long id) throws EntityNotFoundException {
        return service.stateDDD(id);
    }
}
