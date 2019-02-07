package pl.jdomanski.chart.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jdomanski.chart.model.Cycle;

@Repository
public interface CycleRepository extends CrudRepository<Cycle, Long>{

}
