package view;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

import controller.ControllerLivre;
import model.bo.InfoLivre;

	public class Fenetre extends JFrame {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Fenetre() {
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setBounds(150,150,500,500);
			setTitle("Bibliotheque-MVC");
			
			//Affichage des catégories
			JPanel monPanel = new JPanel();
			setContentPane(monPanel);
			setLayout(null);
			
//			JLabel idLivre = new JLabel();
//			idLivre.setText("ID du livre");
//			idLivre.setBounds(20, 20, 80, 20);
//			monPanel.add(idLivre);
			
			JLabel titreLivre = new JLabel();
			titreLivre.setText("Titre du livre");
			titreLivre.setBounds(20, 20, 100, 20);
			monPanel.add(titreLivre);
			
			JLabel isbnLivre = new JLabel();
			isbnLivre.setText("ISBN");
			isbnLivre.setBounds(200, 20, 50, 20);
			monPanel.add(isbnLivre);
			
			JLabel auteurLivre = new JLabel();
			auteurLivre.setText("Auteur");
			auteurLivre.setBounds(250, 20, 80, 20);
			monPanel.add(auteurLivre);
			
			//Affichage des champs de saisie

//			JTextField saisieIdLivre = new JTextField();
//			saisieIdLivre.setBounds(20, 40, 80, 20);
//			monPanel.add(saisieIdLivre);

			JTextField saisieTitreLivre = new JTextField();
			saisieTitreLivre.setBounds(20, 40, 180, 20);
			monPanel.add(saisieTitreLivre);
			
			JTextField saisieIsbnLivre = new JTextField();
			saisieIsbnLivre.setBounds(200, 40, 50, 20);
			monPanel.add(saisieIsbnLivre);

			JTextField saisieAuteurLivre = new JTextField();
			saisieAuteurLivre.setBounds(250, 40, 80, 20);
			monPanel.add(saisieAuteurLivre);
			
			//Affichage du bouton
			JButton benjamin = new JButton("Ajoutez une référence");
			benjamin.setBounds(20, 80, 310, 20);
			monPanel.add(benjamin);
			
			JLabel idLivre_1 = new JLabel();
			idLivre_1.setBounds(20, 100, 80, 20);
			monPanel.add(idLivre_1);
			
			JLabel titreLivre_1 = new JLabel();
			titreLivre_1.setBounds(100, 100, 100, 20);
			monPanel.add(titreLivre_1);
			
			JLabel isbnLivre_1 = new JLabel();
			isbnLivre_1.setBounds(200, 100, 50, 20);
			monPanel.add(isbnLivre_1);
			
			JLabel auteurLivre_1 = new JLabel();
			auteurLivre_1.setBounds(250, 100, 80, 20);
			monPanel.add(auteurLivre_1);
			setVisible(true);
			
			//Action du Bouton
			benjamin.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					String idLivre_str = saisieIdLivre.getText();
//					float idLivre = Integer.parseInt(idLivre_str);
					String titreLivre = saisieTitreLivre.getText();
					String isbnLivre = saisieIsbnLivre.getText();
					String auteurLivre = saisieAuteurLivre.getText();

					InfoLivre info = ControllerLivre.traitement(titreLivre, isbnLivre, auteurLivre);
					
//					saisieIdLivre.setText("");
					saisieTitreLivre.setText("");
					saisieIsbnLivre.setText("");
					saisieAuteurLivre.setText("");
					
					for (int i= 0; i < info.getL().size(); i++) {
						idLivre_1.setText(Integer.toString(info.getL().get(i).getId()));
						titreLivre_1.setText(info.getL().get(i).getTitre());
						isbnLivre_1.setText(info.getL().get(i).getIsbn());
						auteurLivre_1.setText(info.getL().get(i).getAuteur());
					}
				}
			});
		}
	}
