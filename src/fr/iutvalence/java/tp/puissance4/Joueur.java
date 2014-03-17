package fr.iutvalence.java.tp.puissance4;

import java.util.Scanner;

public class Joueur
{
	/**
	 * Demande une colonne de la grille sur laquelle on va poser notre jeton et
	 * stocke le jeton dans la colonne choisie mais que dans la dernière ligne
	 */
	// TODO(fait) déporter cette méthode dans une classe représentant le joueur
	public static void getColonne()
	{
		Puissance4.colonnePleine=true;
		while (Puissance4.colonnePleine)
		{
			Scanner choixColonne = new Scanner(System.in);
			System.out.println("Entrez la colonne dans laquelle vous jouez:");
			int colonne = choixColonne.nextInt();// L'utilisateur choisi la
													// colonne dans laquelle il
													// joue
			
			if (Puissance4.grille[0][colonne] != 0)
			{
				Puissance4.colonnePleine = true;
				System.out
						.println("Colonne pleine, choississez une autre colonne.");
			}
			else
				Puissance4.colonnePleine = false;
		}
		while (Puissance4.grille[Puissance4.ligne][Puissance4.colonne] == 0)
		{
			Puissance4.ligne--;
		}
		if (Puissance4.nombreJetonsJoues % 2 != 0) // Permet de savoir qui est le
												// joueur
			Puissance4.grille[Puissance4.ligne][Puissance4.colonne] = 1;
		else
			Puissance4.grille[Puissance4.ligne][Puissance4.colonne] = 2;
		

	}
}
