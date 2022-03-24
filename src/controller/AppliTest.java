package controller;

import model.bll.CatalogueManager;
import model.bo.Dataset;
import model.bo.Livre;
import model.dal.LivreDAO;

public class AppliTest {

	public static void main(String[] args) {
		CatalogueManager catalogue = new CatalogueManager();
		Livre livre1 = new Livre("La communaute de l'anneau","123-456-789" ,"J.R.R. Tolkien");
		Livre livre2 = new Livre("Les deux tours","123-456-789" ,"J.R.R. Tolkien");
		Livre livre3 = new Livre("Le retour du roi","123-456-789" ,"J.R.R. Tolkien");
		Livre livre4 = new Livre("Le Silmarillon","666-666-666" ,"J.R.R. Tolkien");
		
		System.out.println("\nTest connexion et ajout catalogue  : " );
		CatalogueManager.addLivre(livre1);
		CatalogueManager.addLivre(livre2);
		CatalogueManager.addLivre(livre3);
		CatalogueManager.addLivre(livre4);
		
		System.out.println("\nAffichage du catalogue  : " );
		CatalogueManager.getCatalogue();
		
		System.out.println("\nAffichage d'un seul livre  : " );
		CatalogueManager.selectLivre(1);
		
		System.out.println("\nSuppression d'un livre  : " );
		CatalogueManager.enleverLivre(4);
		CatalogueManager.getCatalogue();
		
		System.out.println("\nModification d'un livre  : " );
		System.out.println("\nLivres avant modification : ");
		System.out.println(livre2.toString());
		System.out.println(livre3.toString());
		livre2.setIsbn("321-654-987");
		livre3.setIsbn("147-258-369");
		System.out.println("\nLivres après modification  : " );
		CatalogueManager.modifierLivre(livre2);
		CatalogueManager.modifierLivre(livre3);
		CatalogueManager.selectLivre(2);
		CatalogueManager.selectLivre(3);
		
//		CatalogueManager.bruleAlexandrie();
//		CatalogueManager.constructionAlexandrie();
		
		}
	}

