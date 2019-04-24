package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "INGREDIENTEN")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class Ingredient {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;

	@OneToOne
	private Voorraad m_Voorraad;

	private String type;

	@OneToMany
	private Set<Levering> leveringen = new HashSet<Levering>();

}