package model.bll;

import java.util.List;

import model.bo.InfoLivre;
import model.bo.Livre;
import model.dal.LivreDAO;

public class CatalogueManager {

	public static void getCatalogue() {
		LivreDAO bibliotheque = new LivreDAO();
		List<Livre> stock = bibliotheque.selectAll();
		for (Livre livre : stock) {
			System.out.println(livre);
		}
		System.out.println("");
	}
	
	public static void addLivre(Livre l) {
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.insert(l);
	}

	public static void selectLivre(int id) {
		LivreDAO bibliotheque = new LivreDAO();
		System.out.println(bibliotheque.selectBy(id));

	}
	
	public static void enleverLivre(int id) {
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.delete(id);
	}
	
	public static void modifierLivre(Livre l) {
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.update(l);
	}
	
	public static Livre nouveauLivre(String titreLivre, String isbnLivre, String auteurLivre ) {
		Livre l = new Livre(titreLivre, isbnLivre, auteurLivre);
		return l;
	}
	
	public static InfoLivre affichageCatalogue(){
		LivreDAO bibliotheque = new LivreDAO();
		List<Livre> stock = bibliotheque.selectAll();
		InfoLivre info = new InfoLivre(stock);
		return info;
	}
	
	
}	