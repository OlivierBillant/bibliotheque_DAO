package model.bo;

import java.util.List;

public class InfoLivre {
	private List<Livre> l;

	public InfoLivre(List<Livre> l) {
		super();
		this.setL(l);
	}

	public List<Livre> getL() {
		return l;
	}

	public void setL(List<Livre> l) {
		this.l = l;
	}
	
	
	
}
