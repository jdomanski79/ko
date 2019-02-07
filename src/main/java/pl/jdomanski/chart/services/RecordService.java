package pl.jdomanski.chart.services;

import java.time.LocalDate;
import java.util.Optional;

import pl.jdomanski.chart.model.Record;

public interface RecordService {

	Record save(Record record);
	
	Optional<Record> findById(Long id);
	
	Optional<Record> findByDate(LocalDate date);
	
	void delete(Record record);
}
