package pl.jdomanski.chart.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Record {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	
	@Enumerated(EnumType.STRING)
	private MucusTypes mucusType;
	
	private String description;
	private boolean intercourse;

	@Enumerated(EnumType.STRING)
	private Frequencies frequency;
	
	private boolean peak;
	
	@ManyToOne
	@JoinColumn(name = "cycle_id")
	private Cycle cycle;
}
