package fr.iutvalence.java.tp.puissance4;

import java.util.Scanner;

// TODO(fait) Ecrire un commentaire plus précis
/**
 * Les caractéristiques d'une partie de puissance4.
 */
public class Puissance4
{


	// TODO(fait) corriger le commentaire 
	/**
	 * Le nombre d'emplacement total dans la grille
	 */
	public final static int CAPACITE_PAR_DEFAUT = 42;


	
	

	// TODO(fait) corriger le commentaire 
	/**
	 * Le nombre de jetons joués dans la partie
	 */
	

	private int nombreJetonsJoues;
	
	/**
	 * Indicateur permettant de savoir si une colonne est pleine
	 */
	private boolean colonnePleine=true;
	
	/**
	 *Une colonne que l'utilisateur utilisera pour placer son jeton 
	 */
	private int Colonne;
	
	/**
	 * Ligne permettant de parcourir la colonne et de savoir ou l'on peut écrire
	 */
	private int Ligne=5;
	
	// TODO(fait) corriger le commentaire 
	/**
	 * La capacité de la grille de puissance 4
	 */
	private int capaciteGrille;
	
	/**
	 * Une référence vers un tableau de jetons
	 */
	
	private int[][] grille;

	// TODO (fait) corriger le commentaire 
	// TODO(fait) Ecrire un commentaire plus précis
	/**
	 * Crée une nouvelle partie en initialisant la grille et les jetons
	 */
	public Puissance4()
	{
		this.capaciteGrille = CAPACITE_PAR_DEFAUT;
		this.nombreJetonsJoues = 0;
		this.grille = new int[6][7];
		for (int i=0 ; i<this.grille.length; i++){
			for (int j=0; j<this.grille.length;j++){
				this.grille[i][j]=0;
			}
		}
		System.out.println("Les lignes vont de 0 à 5 et les colonnes de 0 à 6");
	}

	/**
	 * Demande une colonne de la grille sur laquelle on va poser notre jeton
	 * et stocke le jeton dans la colonne choisie mais que dans la dernière ligne
	 */
	
	public void getColonne(){
		while(colonnePleine=true){
			Scanner choixColonne= new Scanner(System.in);
			System.out.println("Entrez la colonne dans laquelle vous jouez:");
			int colonne = choixColonne.nextInt();// L'utilisateur choisi la colonne dans laquelle il joue
			Colonne = colonne;
			if (this.grille[0][Colonne]!=0){
				colonnePleine=true;
				System.out.println("Colonne pleine, choississez une autre colonne.");
				}
			else
				colonnePleine=false;
		}
		while(this.grille[Ligne][Colonne]==0){
				Ligne--;
		}
		if(this.nombreJetonsJoues%2 !=0) // Permet de savoir qui est le joueur
				this.grille[Ligne][Colonne]=1;
		else
				this.grille[Ligne][Colonne]=2;

		
	}

	// TODO(fait) déplacer les méthodes après les constructeurs
	// TODO(fait) corriger le commentaire 
	/**
	 * Joue l'intégralité d'une partie.
	 * Il reste à régler le fait qu'un joueur ait gagné
	 */
	public void jouer()
	{
		// TODO(fait) corriger les accents
		
		System.out.println("Partie démarrée");
		System.out.println("Joueur 1 : Jetons rouge");
		System.out.println("Joueur 2 : Jetons jaune");
		while(this.nombreJetonsJoues < this.capaciteGrille){
			System.out.println("JOUEUR 1"); // fait jouer le joueur 1 
			getColonne();
			this.nombreJetonsJoues++; 
			System.out.println("JOUEUR 2");
			getColonne();
			this.nombreJetonsJoues++;
		}
		
	}
}
