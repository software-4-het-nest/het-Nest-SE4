package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BROUWSELS")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class Brouwsel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;

	@OneToMany
	private Set<BrouwLogSnapshot> BrouwLogSnapshots = new HashSet<BrouwLogSnapshot>();

	@OneToMany
	private Set<BrouwselIngredient> BrouwselIngredienten = new HashSet<BrouwselIngredient>();
	private int status;

	@ManyToOne
	private Recept m_Recept;

}