package model.bo;

public class Livre {
	private Integer id;
	private String titre;
	private String isbn;
	private Auteur auteur_id;
	
	public Livre() {		
	}
	
	public Livre(String titre, String isbn, Auteur auteur) {
		this.titre = titre;
		this.isbn = isbn;
		this.auteur_id = auteur;
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

	public Auteur getAuteur_id() {
		return auteur_id;
	}

	public void setAuteur_id(Auteur auteur) {
		this.auteur_id = auteur;
	}

	@Override
	public String toString() {
		return "Livre id " + id + ", titre " + titre + ", isbn " + isbn + ", auteur " + auteur_id;
	}
	
	

	
}
