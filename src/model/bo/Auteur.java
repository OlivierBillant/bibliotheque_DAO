package model.bo;

public class Auteur {
	private Integer id;
	private String name;
	
	public Auteur(String nom) {
		this.name = nom;
	}

	public Auteur() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nom) {
		this.name = nom;
	}

	@Override
	public String toString() {
		return "Auteur id " + id + ", nom " + name;
	}

	

}
