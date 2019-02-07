package pl.jdomanski.chart.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pl.jdomanski.chart.model.Record;
import pl.jdomanski.chart.repositories.RecordRepository;

@Service
public class RecordServiceImpl implements RecordService {

	private RecordRepository recordRepository;

	public RecordServiceImpl(RecordRepository recordRepository) {
		this.recordRepository = recordRepository;
	}

	@Override
	public Record save(Record record) {
		return recordRepository.save(record);
	}

	@Override
	public Optional<Record> findById(Long id) {
		return recordRepository.findById(id);
	}

	@Override
	public Optional<Record> findByDate(LocalDate date) {
		return recordRepository.findByDate(date);
	}

	@Override
	public void delete(Record record) {
		
		recordRepository.delete(record);
	}
	
	
}
