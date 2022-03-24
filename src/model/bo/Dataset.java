package model.bo;

import java.util.ArrayList;
import java.util.List;

public class Dataset {
	private List<Livre> dataset = new ArrayList<Livre>();
	Livre livre1 = new Livre("La communaute de l'anneau","123-456-789" ,"J.R.R. Tolkien");
	Livre livre2 = new Livre("Les deux tours","123-456-789" ,"J.R.R. Tolkien");
	Livre livre3 = new Livre("Le retour du roi","123-456-789" ,"J.R.R. Tolkien");
	Livre livre4 = new Livre("Le Silmarillon","666-666-666" ,"J.R.R. Tolkien");
	
	public Dataset() {
		dataset.add(livre1);
		dataset.add(livre2);
		dataset.add(livre3);
		dataset.add(livre4);
	}

	public List<Livre> getDataset() {
		return dataset;
	}



	public void setDataset(List<Livre> dataset) {
		this.dataset = dataset;
	}

	@Override
	public String toString() {
		return "Dataset [dataset=" + dataset + ", livre1=" + livre1 + ", livre2=" + livre2 + ", livre3=" + livre3
				+ ", livre4=" + livre4 + "]";
	}
	
	
}
