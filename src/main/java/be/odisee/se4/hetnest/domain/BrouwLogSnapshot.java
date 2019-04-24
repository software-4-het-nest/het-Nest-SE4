package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BROUWLOGSNAPSHOTS")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class BrouwLogSnapshot {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private final long id;
	private String status;

	@OneToMany
	private Set<BrouwEntry> brouwEntries = new HashSet<BrouwEntry>();
}