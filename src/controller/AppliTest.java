package controller;

import model.bll.CatalogueManager;
import model.bo.Livre;

public class AppliTest {

	public static void main(String[] args) {
		CatalogueManager catalogue = new CatalogueManager();
		Livre livre1 = new Livre("La communaute de l'anneau","123-456-789" ,"J.R.R. Tolkien");
		Livre livre2 = new Livre("Les deux tours","123-456-789" ,"J.R.R. Tolkien");
		Livre livre3 = new Livre("Le retour du roi","123-456-789" ,"J.R.R. Tolkien");
		Livre livre4 = new Livre("Le Silmarillon","666-666-666" ,"J.R.R. Tolkien");
		
		System.out.println("\nTest connexion et ajout catalogue  : " );
		catalogue.addLivre(livre1);
		catalogue.addLivre(livre2);
		catalogue.addLivre(livre3);
		catalogue.addLivre(livre4);
		
		System.out.println("\nAffichage du catalogue  : " );
		catalogue.getCatalogue();
		
		System.out.println("\nAffichage d'un seul livre  : " );
		catalogue.selectLivre(1);
		
		System.out.println("\nSuppression d'un livre  : " );
		catalogue.enleverLivre(4);
		catalogue.getCatalogue();
		
		System.out.println("\nModification d'un livre  : " );
		System.out.println("Livres avant modification : ");
		System.out.println(livre2.toString());
		System.out.println(livre3.toString());
		livre2.setIsbn("321-654-987");
		livre3.setIsbn("147-258-369");
		System.out.println("\nLivres après modification  : " );
		catalogue.modifierLivre(livre2);
		catalogue.modifierLivre(livre3);
		catalogue.selectLivre(2);
		catalogue.selectLivre(3);
		}
	}

