package controller;

import com.mysql.jdbc.Connection;

import model.bo.Livre;
import model.dal.Connexion;
import model.dal.LivreDAO;

public class AppliTest {

	public static void main(String[] args) {
//		java.sql.Connection cnx = Connexion.getCnx();
		Livre livre1 = new Livre("La communaute de l'anneau","123-456-789" ,"J.R.R. Tolkien");
		Livre livre2 = new Livre("Les deux tours","123-456-789" ,"J.R.R. Tolkien");
		Livre livre3 = new Livre("Le retour du roi","123-456-789" ,"J.R.R. Tolkien");
		LivreDAO bibliotheque = new LivreDAO();
		bibliotheque.insert(livre1);
		bibliotheque.insert(livre2);
		bibliotheque.insert(livre3);
	}

}
