package pl.jdomanski.chart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Cycle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="cycle", cascade=CascadeType.ALL)
	private List<Record> records = new ArrayList<>();
	
	public void addRecord(Record record) {
		records.add(record);
		record.setCycle(this);
	}
}
