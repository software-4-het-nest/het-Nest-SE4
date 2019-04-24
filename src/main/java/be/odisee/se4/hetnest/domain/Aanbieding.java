package be.odisee.se4.hetnest.domain;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "AANBIEDINGEN")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class Aanbieding {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;

	@OneToOne
	private Aanbieder aanbieder;
	private int hoeveelheid;
	private String type;
	private double prijs;

}