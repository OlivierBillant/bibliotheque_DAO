package controller;

import model.bll.CatalogueManager;

public class AppliTest_Auteur {

	public static void main(String[] args) {
		CatalogueManager catalogue = new CatalogueManager();
		catalogue.getAuthorList();
		catalogue.getCatalogue();
	}

}
