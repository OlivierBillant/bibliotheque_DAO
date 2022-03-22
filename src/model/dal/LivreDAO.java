package model.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import model.bo.Livre;


public class LivreDAO implements InterfaceDAO<Livre>{

//		public Livre selectBy(int id) {
//			Livre l = null;
//			Connection cnx = Connexion.getCnx();
//			String sqlPrepared = "SELECT * FROM livre WHERE id = ?";
//			try {
//				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared);
//				pStmt.setInt(1, id); // binder
//				// pStmt.executeUpdate();
//				ResultSet rs = pStmt.executeQuery();
//				rs.next(); // extraire de la pile
//				if (rs.getString("type").equals("ramette")) {
//					Ramette r = new Ramette();
//					r.setIdArticle(rs.getInt("id"));
//					r.setReference(rs.getString("reference"));
//					r.setMarque(rs.getString("marque"));
//					r.setPrixUnitaire(rs.getFloat("prixUnitaire"));
//					r.setQteStock(rs.getInt("qteStock"));
//					r.setDesignation(rs.getString("designation"));
//					r.setGrammage(rs.getInt("grammage"));
//					a = r;
//				} else if (rs.getString("type").equals("stylo")) {
//					Stylo s = new Stylo();
//					s.setIdArticle(rs.getInt("id"));
//					s.setReference(rs.getString("reference"));
//					s.setMarque(rs.getString("marque"));
//					s.setPrixUnitaire(rs.getFloat("prixUnitaire"));
//					s.setQteStock(rs.getInt("qteStock"));
//					s.setDesignation(rs.getString("designation"));
//					s.setCouleur(rs.getString("couleur"));
//					a = s;
//				}
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			return a;
//		}
//
//		public List<Livre> selectAll() {
//			List<Livre> articles = new ArrayList<Livre>();
//			Connection cnx = Connexion.getCnx();
//			Livre a = null;
//			String sql = "SELECT * from article";
//			try {
//
//				Statement state = cnx.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
//				// j excecute ma query
//				ResultSet rs = state.executeQuery(sql);
//				// tant qu'il y a des lignes ds la pile : je boucle
//				while (rs.next()) {
//					if (rs.getString("type").equals("ramette")) {
//						Ramette r = new Ramette();
//						r.setIdArticle(rs.getInt("id"));
//						r.setReference(rs.getString("reference"));
//						r.setMarque(rs.getString("marque"));
//						r.setPrixUnitaire(rs.getFloat("prixUnitaire"));
//						r.setQteStock(rs.getInt("qteStock"));
//						r.setDesignation(rs.getString("designation"));
//						r.setGrammage(rs.getInt("grammage"));
//						a = r;
//					} else if (rs.getString("type").equals("stylo")) {
//						Stylo s = new Stylo();
//						s.setIdArticle(rs.getInt("id"));
//						s.setReference(rs.getString("reference"));
//						s.setMarque(rs.getString("marque"));
//						s.setPrixUnitaire(rs.getFloat("prixUnitaire"));
//						s.setQteStock(rs.getInt("qteStock"));
//						s.setDesignation(rs.getString("designation"));
//						s.setCouleur(rs.getString("couleur"));
//						a = s;
//					}
//					articles.add(a);
//				}
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//			return articles;
//		}

//		public void update(Livre l) {
//			Connection cnx = Connexion.getCnx();
//			String sqlPrepared = "UPDATE article";
//			sqlPrepared += " SET reference= ?,";
//			sqlPrepared += " marque=?,";
//			sqlPrepared += " designation=?,";
//			sqlPrepared += " prixUnitaire=?,";
//			sqlPrepared += " qteStock=?,"; // 5
//			sqlPrepared += " grammage=?,"; // 6
//			sqlPrepared += " couleur=?, "; // 7
//			sqlPrepared += " type=? "; // 8
//			sqlPrepared += " WHERE id=? "; // 9
//			
//			try {
//				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared);
//				pStmt.setString(1, l.getReference());
//				pStmt.setString(2, l.getMarque());
//				pStmt.setString(3, l.getDesignation());
//				pStmt.setFloat(4, l.getPrixUnitaire());
//				pStmt.setInt(5, l.getQteStock());
//				pStmt.setInt(9, l.getIdArticle());
//
//				if (a instanceof Ramette) {
//					Ramette r = (Ramette) a;
//					pStmt.setInt(6, r.getGrammage());
//					pStmt.setNull(7, Types.NULL);
//					pStmt.setString(8, "ramette");
//				} else if (a instanceof Stylo) {
//					Stylo s = (Stylo) a;
//					pStmt.setNull(6, Types.NULL);
//					pStmt.setString(7, s.getCouleur());
//					pStmt.setString(8, "stylo");
//				}
//				pStmt.executeUpdate();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

		public void insert(Livre l) {
			Connection cnx = Connexion.getCnx();
			String sqlPrepared = "INSERT INTO livre VALUES (NULL,?,?,?)";
			try {
				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared, Statement.RETURN_GENERATED_KEYS);
				// binder
				// Valoriser les parametres de la requete
				// 1 => premier ?
				pStmt.setString(1, l.getTitre());
				pStmt.setString(2, l.getIsbn());
				pStmt.setString(3, l.getAuteur());
				pStmt.executeUpdate();
				// --- id ????
				// on demande l id donné par l base
				ResultSet rs = pStmt.getGeneratedKeys();
				rs.next(); // enlever de la pile
				l.setId(rs.getInt(1));
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public List<Livre> selectAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Livre selectBy(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void update(Livre t) {
	// TODO Auto-generated method stub
	
}

//		public void delete(int id) {
//			Connection cnx = Connexion.getCnx();
//			String sqlPrepared = "DELETE FROM article WHERE id = ?";
//			try {
//				PreparedStatement pStmt = cnx.prepareStatement(sqlPrepared);
//				pStmt.setInt(1, id);
//				pStmt.executeUpdate();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}


}
