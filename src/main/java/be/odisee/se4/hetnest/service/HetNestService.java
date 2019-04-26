package be.odisee.se4.hetnest.service;

import be.odisee.se4.hetnest.domain.User;

import java.util.List;

/**
 * @author User
 * @version 1.0
 * @created 17-Mar-2019 14:19:01
 */

public interface HetNestService {

	public void voorraadVoegToe();

	public void voorraadNeemAf();

	public void leveringBestel();

	public void leveringKeurGoed();

	public void leveringKeurAf();

	public void leveringAnnuleer();

	public void leveringVraagAnnulatieAan();

	public void aanbiedingAccepteerAanbod();

	public void aanbiedingWeigerAanbod();

	public void aanbiedingOnderhandelAanbod();

	public void maakBrouwselAan();

	public void voegBrouwEntryToe();

	public void verwijderBrouwEntry();

	public void neemBrouwLogSnapshot();

	public void archiveerBrouwsel();

	public void voltooiBrouwsel();

	/**
	 * 
	 * @param hoeveelheid
	 */
	public void lerveringMaakAan(int hoeveelheid);

	public void leveringAangekomen();

	public void aanbiedingenVraagOp();

	public List<User> geefAllePersonen();
}