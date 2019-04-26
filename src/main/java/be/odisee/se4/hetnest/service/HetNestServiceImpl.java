package be.odisee.se4.hetnest.service;

import be.odisee.se4.hetnest.dao.*;
import be.odisee.se4.hetnest.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import java.util.List;

/**
 * @author User
 * @version 1.0
 * @created 17-Mar-2019 14:19:05
 */
@Service("hetNestService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
public class HetNestServiceImpl implements HetNestService {

	public Ingredient m_Ingredient;
	public Brouwsel m_Brouwsel;
	public Aanbieding m_Aanbieding;

	public HetNestServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	public void voorraadVoegToe(){

	}

	public void voorraadNeemAf(){

	}

	public void leveringBestel(){

	}

	public void leveringKeurGoed(){

	}

	public void leveringKeurAf(){

	}

	public void leveringAnnuleer(){

	}

	public void leveringVraagAnnulatieAan(){

	}

	public void aanbiedingAccepteerAanbod(){

	}

	public void aanbiedingWeigerAanbod(){

	}

	public void aanbiedingOnderhandelAanbod(){

	}

	public void maakBrouwselAan(){

	}

	public void voegBrouwEntryToe(){

	}

	public void verwijderBrouwEntry(){

	}

	public void neemBrouwLogSnapshot(){

	}

	public void archiveerBrouwsel(){

	}

	public void voltooiBrouwsel(){

	}

	/**
	 * 
	 * @param hoeveelheid
	 */
	public void lerveringMaakAan(int hoeveelheid){

	}

	public void leveringAangekomen(){

	}

	public void aanbiedingenVraagOp(){

	}

	@Autowired
	private UserRepository userrepository = null;

	public List<User> geefAllePersonen() {
		return userrepository.findAll();
	}


}