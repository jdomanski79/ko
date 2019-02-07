package pl.jdomanski.chart.services;

import java.util.Optional;

import pl.jdomanski.chart.model.Cycle;

public interface CycleService {

	Optional<Cycle> findById(Long id);
	
	Cycle save(Cycle cycle);
	
	void delete(Cycle cycle);
}
