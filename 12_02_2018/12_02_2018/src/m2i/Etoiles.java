package m2i;

import javax.swing.JOptionPane;

public class Etoiles {

	public static void main(String[] args) {
//		�toile <- '*'
//		nb_etages <- 5
//		Pour i allant de 1 � nb_etages inclus
//		| Pour j allant de 0 � i exclu
//		| | afficher �toile
//		| FinPour
//		| afficher saut de ligne
//		FinPour
		
		char etoile = '*';
		int nbEtages = Integer.parseInt(JOptionPane.showInputDialog("Nombre d'�tages"));
		
		for(int i = 1 ; i <= nbEtages ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(etoile);
			}
			System.out.println();
		}

	}

}
