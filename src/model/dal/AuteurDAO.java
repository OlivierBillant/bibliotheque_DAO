package model.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bo.Auteur;

public class AuteurDAO implements InterfaceDAO<Auteur>{
	public List<Auteur> selectAll() {
		List<Auteur> liste = new ArrayList<Auteur>();
		Connection cnx = Connexion.getCnx();
		String sql = "SELECT * from auteurs";
		try {
			Statement state = cnx.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = state.executeQuery(sql);
			while (rs.next()) {
				Auteur a = new Auteur();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				liste.add(a);
				}
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Auteur selectBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Auteur t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Auteur t) {
		// TODO Auto-generated method stub
		
	}
}
