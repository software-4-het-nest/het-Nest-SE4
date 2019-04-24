package be.odisee.se4.hetnest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "AANBIEDERS")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE,force=true)
public class Aanbieder {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private final long id;
    private String name;
}
