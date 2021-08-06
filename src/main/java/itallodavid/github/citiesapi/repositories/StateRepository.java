package itallodavid.github.citiesapi.repositories;

import itallodavid.github.citiesapi.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
