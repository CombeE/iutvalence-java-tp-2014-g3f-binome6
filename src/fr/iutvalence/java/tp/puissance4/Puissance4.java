package fr.iutvalence.java.tp.puissance4;

import java.util.Scanner;

// TODO Ecrire un commentaire plus précis
/**
 * Les caractéristiques d'une partie de puissance4.
 */
public class Puissance4
{
	/**
	 * Le nombre d'emplacements total dans la grille
	 */
	public final static int NOMBRE_DE_LIGNES = 6;

	public final static int NOMBRE_DE_COLONNES = 7;

	/**
	 * Le nombre de jetons joués dans la partie
	 */
	private int nombreJetonsJoues;

	// TODO(fait) écrire un commentaire plus précis
	/**
	 * Un tableau ou l'on pourra insérer des jetons .
	 */
	private Case[][] grille;
	
	private Joueur joueur1;
	
	private Joueur joueur2;
	

	/**
	 * Crée une nouvelle partie en initialisant la grille et les jetons
	 */
	public Puissance4()
	{
		this.nombreJetonsJoues = 0;
		this.grille = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.grille[numeroDeLigne][numeroDeColonne] = Case.VIDE;

		System.out.println("Les lignes vont de 0 à 5 et les colonnes de 0 à 6");
		
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
	}

	/**
	 * Joue l'intégralité d'une partie. Il reste à régler le fait qu'un joueur
	 * ait gagné
	 */
	public void jouer()
	{
		System.out.println("Partie démarrée");
		System.out.println("Joueur 1 : Jetons rouge");
		System.out.println("Joueur 2 : Jetons jaune");
		for (int nombreDeTours = 0; nombreDeTours < NOMBRE_DE_COLONNES * NOMBRE_DE_LIGNES; nombreDeTours++)
		{
			int numeroDeColonneOuJouer = this.joueur1.obtenirColonneOuJouer();
			/ ...
			this.nombreJetonsJoues++;
		}

	}
}
