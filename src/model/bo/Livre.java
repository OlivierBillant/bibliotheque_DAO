package model.bo;

public class Livre {
	private Integer id;
	private String titre;
	private String isbn;
	private String auteur;
	
	public Livre() {		
	}
	
	public Livre(String titre, String isbn, String auteur) {
		this.titre = titre;
		this.isbn = isbn;
		this.auteur = auteur;
	}

	public Livre(Integer id, String titre, String isbn, String auteur) {
		this.id = id;
		this.titre = titre;
		this.isbn = isbn;
		this.auteur = auteur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre id " + id + ", titre " + titre + ", isbn " + isbn + ", auteur " + auteur;
	}
	
	

	
}
