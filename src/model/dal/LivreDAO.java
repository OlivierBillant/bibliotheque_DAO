package model.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bo.Auteur;
import model.bo.Livre;


public class LivreDAO implements InterfaceDAO<Livre>{

		public Livre selectBy(int id) {
			Livre l = new Livre();
			Connection cnx = Connexion.getCnx();
			String sqlPrepared = "SELECT * FROM livre_test WHERE id = ?";
			try {
				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared);
				pStmt.setInt(1, id);
				ResultSet rs = pStmt.executeQuery();
				rs.next(); // extraire de la pile
				l.setId(rs.getInt("id"));
				l.setTitre(rs.getString("titre"));
				l.setIsbn(rs.getString("isbn"));
				l.setAuteur_id(rs.getInt("auteur_id"));
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return l;
		}
//
		public List<Livre> selectAll() {
			List<Livre> stock = new ArrayList<Livre>();
			Connection cnx = Connexion.getCnx();
			String sql = "SELECT l.id AS livre_id, titre, isbn, a.id AS auteur_id, name FROM livre_test AS l INNER JOIN auteurs AS a ON a.id = l.auteur_id";
			try {
				Statement state = cnx.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = state.executeQuery(sql);
				while (rs.next()) {
					Livre l = new Livre();
					l.setId(rs.getInt("id"));
					l.setTitre(rs.getString("titre"));
					l.setIsbn(rs.getString("isbn"));
					l.setAuteur_id(rs.getClass());
					stock.add(l);
					}
				}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return stock;
		}

		public void update(Livre l) {
			Connection cnx = Connexion.getCnx();
			String sqlPrepared = "UPDATE livre";
			sqlPrepared += " SET titre= ?,";
			sqlPrepared += " isbn=?,";
			sqlPrepared += " auteur=?";
			sqlPrepared += " WHERE id=? ";
			
			try {
				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared);
				pStmt.setString(1, l.getTitre());
				pStmt.setString(2, l.getIsbn());
				pStmt.setInt(3, l.getAuteur_id());
				pStmt.setInt(4, l.getId());
				
				pStmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void insert(Livre l) {
			Connection cnx = Connexion.getCnx();
			String sqlPrepared = "INSERT INTO livre VALUES (NULL,?,?,?)";
			try {
				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared, Statement.RETURN_GENERATED_KEYS);
	
				pStmt.setString(1, l.getTitre());
				pStmt.setString(2, l.getIsbn());
				pStmt.setInt(3, l.getAuteur_id());
				pStmt.executeUpdate();

				ResultSet rs = pStmt.getGeneratedKeys();
				rs.next();
				l.setId(rs.getInt(1));
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void delete(int id) {
			Connection cnx = Connexion.getCnx();
			String sqlPrepared = "DELETE FROM livre WHERE id = ?";
			try {
				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared);
				pStmt.setInt(1, id);
				pStmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}

