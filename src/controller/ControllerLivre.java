package controller;

import model.bll.CatalogueManager;
import model.bo.InfoLivre;
import model.bo.Livre;
import view.Fenetre;

public class ControllerLivre {
	private static ControllerLivre instance;
	private static Fenetre f1;
	
	private ControllerLivre() {};

	public ControllerLivre getInstance(){
		if(instance == null) {
			instance  = new ControllerLivre();
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		f1 = new Fenetre();
	}
	
	public static InfoLivre traitement(String titreLivre, String isbnLivre, String auteurLivre) {
		Livre l = CatalogueManager.nouveauLivre(titreLivre, isbnLivre, auteurLivre);;
		CatalogueManager.addLivre(l);
		InfoLivre info = CatalogueManager.affichageCatalogue();
		return info;
	}

}
