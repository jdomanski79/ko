package pl.jdomanski.chart.repositories;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import pl.jdomanski.chart.model.Record;

public interface RecordRepository extends CrudRepository<Record, Long>{

	Optional<Record> findByDate(LocalDate date);

}
