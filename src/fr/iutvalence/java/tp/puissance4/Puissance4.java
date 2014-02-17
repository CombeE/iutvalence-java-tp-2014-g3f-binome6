package fr.iutvalence.java.tp.puissance4;

/**
 * Une partie de puissance4.
 */
public class Puissance4 {

	/**
	 * Joue l'int�gralit� d'une partie.
	 */
	public void jouer(){
		
		System.out.println("Partie d�marr�e");
		
	}
	/**
	 * La capacit� par d�faut de la grille est de 42 jetons
	 */
	public final static int CAPACITE_PAR_DEFAUT = 42;
	/**
	 * Le nombre de jeton qu'un joueur a en d�but de partie
	 */
	public final static int JETONS_PAR_DEFAUT = 21;
	
	/**
	 * La capacit� de la grille de puissance 4
	 */
	public int capaciteGrille;
	
	/**
	 * Le nombre de jeton du joueur 1
	 */
	public int jetonsJoueur1;
	
	/**
	 * Le nombre de jeton du joueur 2
	 */
	public int jetonsJoueur2;
	
	/**
	 * la couleur des jetons du joueur 1
	 */
	public boolean couleurJetons1;
	
	/**
	 * la couleur des jetons du joueur 2
	 */
	public boolean couleurJetons2;
	
	/**
	 * Cr�e une nouvelle partie 
	 */

	
	public Puissance4(){
		this.capaciteGrille = CAPACITE_PAR_DEFAUT ;
		this.jetonsJoueur1 = JETONS_PAR_DEFAUT;
		this.jetonsJoueur2 = JETONS_PAR_DEFAUT;
		this.couleurJetons1 = true;
		this.couleurJetons2 = false;
	}
}
