package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "VOORRADEN")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class Voorraad {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;
	private String type;
	private int aantal;
}