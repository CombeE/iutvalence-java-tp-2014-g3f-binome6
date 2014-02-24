package fr.iutvalence.java.tp.puissance4;

// TODO écrire un commentaire plus précis
/**
 * Une partie de puissance4.
 */
public class Puissance4
{

	// TODO déplacer les méthodes après les constructeurs
	// TODO corriger le commentaire 
	/**
	 * Joue l'int�gralit� d'une partie.
	 */
	public void jouer()
	{
		// TODO corriger les accents
		System.out.println("Partie d�marr�e");
	}

	// TODO corriger le commentaire 
	/**
	 * La capacit� par d�faut de la grille
	 */
	public final static int CAPACITE_PAR_DEFAUT = 42;
	
	// TODO corriger le commentaire 
	/**
	 * Le nombre de jetons qu'un joueur a en d�but de partie
	 */
	public final static int JETONS_PAR_DEFAUT = 21;

	// TODO corriger le commentaire 
	/**
	 * Le nombre de jetons jou�s dans la partie
	 */
	public int nombreJetonsJoues;

	// TODO corriger le commentaire 
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

	// TODO corriger le commentaire 
	// TODO écrire un commentaire plus précis
	/**
	 * Cr�e une nouvelle partie
	 */
	public Puissance4()
	{
		this.capaciteGrille = CAPACITE_PAR_DEFAUT;
		this.jetonsJoueur1 = JETONS_PAR_DEFAUT;
		this.jetonsJoueur2 = JETONS_PAR_DEFAUT;
		// TODO définir des constantes pour les couleurs
		this.couleurJetons1 = true;
		this.couleurJetons2 = false;
		this.nombreJetonsJoues = 0;
	}
}
