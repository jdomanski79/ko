package pl.jdomanski.chart.services;

import java.util.Optional;

import pl.jdomanski.chart.model.Cycle;
import pl.jdomanski.chart.repositories.CycleRepository;

public class CycleServiceImpl implements CycleService {

	private CycleRepository cycleRepository;
	
	public CycleServiceImpl(CycleRepository cycleRepository) {
		this.cycleRepository = cycleRepository;
	}

	@Override
	public Optional<Cycle> findById(Long id) {
		return cycleRepository.findById(id);
	}

	@Override
	public Cycle save(Cycle cycle) {
		return cycleRepository.save(cycle);
	}

	@Override
	public void delete(Cycle cycle) {
		// TODO Auto-generated method stub

	}

}
