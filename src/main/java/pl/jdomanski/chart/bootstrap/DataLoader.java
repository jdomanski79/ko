package pl.jdomanski.chart.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import pl.jdomanski.chart.model.Cycle;
import pl.jdomanski.chart.model.Frequencies;
import pl.jdomanski.chart.model.MucusTypes;
import pl.jdomanski.chart.model.Record;
import pl.jdomanski.chart.services.CycleService;
import pl.jdomanski.chart.services.RecordService;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

	private CycleService cycleService;
	private RecordService recordService;
	
		public DataLoader(CycleService cycleService, RecordService recordService) {
		this.cycleService = cycleService;
		this.recordService = recordService;
	}

	@Override
	public void run(String... args) throws Exception {
		loadData();
		
	}

	private void loadData() {
	
		Cycle cycle1 = new Cycle();
		
		LocalDate date = LocalDate.of(2018, 12, 30);
		int i = 0;
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		cycle1.addRecord(new Record(date.plusDays(i++), MucusTypes.FLOW, "H", false, Frequencies.AD, false));
		
		cycleService.save(cycle1);
		
		log.info("inital data loaded");
	}

}
