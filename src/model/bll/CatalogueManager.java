package model.bll;

import java.util.List;

import model.bo.Livre;
import model.dal.LivreDAO;

public class CatalogueManager {

	public void getCatalogue() {
		LivreDAO bibliotheque = new LivreDAO();
		List<Livre> stock = bibliotheque.selectAll();
		for (Livre livre : stock) {
			System.out.println(livre);
		}
		System.out.println("");
	}
	
	public void addLivre(Livre l) {
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.insert(l);
	}

	public void selectLivre(int id) {
		LivreDAO bibliotheque = new LivreDAO();
		System.out.println(bibliotheque.selectBy(id));

	}
	
	public void enleverLivre(int id) {
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.delete(id);
	}
	
	public void modifierLivre(Livre l) {
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.update(l);
	}
}	