package m2i;

import javax.swing.JOptionPane;

public class Etoiles {

	public static void main(String[] args) {
//		étoile <- '*'
//		nb_etages <- 5
//		Pour i allant de 1 à nb_etages inclus
//		| Pour j allant de 0 à i exclu
//		| | afficher étoile
//		| FinPour
//		| afficher saut de ligne
//		FinPour
		
		char etoile = '*';
		int nbEtages = Integer.parseInt(JOptionPane.showInputDialog("Nombre d'étages"));
		
		for(int i = 1 ; i <= nbEtages ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(etoile);
			}
			System.out.println();
		}

	}

}
