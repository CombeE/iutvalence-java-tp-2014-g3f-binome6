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
	public final static int CAPACITE_PAR_DEFAUT = 42;

	/**
	 * Le nombre de jetons joués dans la partie
	 */
	public static int nombreJetonsJoues;

	/**
	 * Indicateur permettant de savoir si une colonne est pleine
	 */
	// TODO(fait) initialiser l'attribut dans le constructeur
	public static boolean colonnePleine;

	// TODO (fait) ne pas confondre variable locale et attribut
	// TODO (fait)respecter les conventions d'écriture
	/**
	 * Une colonne que l'utilisateur utilisera pour placer son jeton
	 */
	public static int colonne;

	/**
	 * Ligne permettant de parcourir la colonne et de savoir ou l'on peut écrire
	 */
	// TODO (fait)ne pas confondre variable locale et attribut
	// TODO (fait)respecter les conventions d'écriture
	// TODO (fait)initialiser l'attribut dans le constructeur
	public static int ligne;

	// TODO corriger le commentaire
	/**
	 * La capacité de la grille de puissance 4
	 */
	private final int capaciteGrille;

	// TODO(fait) écrire un commentaire plus précis
	/**
	 * Un tableau ou l'on pourra insérer des jetons .
	 */
	public static int[][] grille;

	/**
	 * Crée une nouvelle partie en initialisant la grille et les jetons
	 */
	public Puissance4()
	{	this.ligne=5;
		this.colonnePleine=true;
		this.capaciteGrille = CAPACITE_PAR_DEFAUT;
		this.nombreJetonsJoues = 0;
		this.grille = new int[6][7];
		for (int i = 0; i < this.grille.length; i++)
		{
			for (int j = 0; j < this.grille.length; j++)
			{
				this.grille[i][j] = 0;
			}
		}
		System.out.println("Les lignes vont de 0 à 5 et les colonnes de 0 à 6");
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
		while (this.nombreJetonsJoues < this.capaciteGrille)
		{
			System.out.println("JOUEUR 1"); // fait jouer le joueur 1
			Joueur.getColonne();
			this.nombreJetonsJoues++;
			System.out.println("JOUEUR 2");
			Joueur.getColonne();
			this.nombreJetonsJoues++;
		}

	}
}
