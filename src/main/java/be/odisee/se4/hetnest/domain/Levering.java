package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "LEVERINGEN")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class Levering {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;

	@OneToOne
	private Aanbieding m_Aanbieding;

	private LocalDateTime vervaldatum;
	private double prijs;
	private String status;
	private int hoeveelheid;
	private LocalDateTime leveringsdatum;

}