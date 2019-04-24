package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "BROUWSELINGREDIENTEN")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class BrouwselIngredient {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;

	@OneToOne
	private Ingredient m_Ingredient;
	private int hoeveelheid;

}