package fr.iutvalence.java.tp.puissance4;

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
	
	// TODO (fait) corriger le commentaire 
	/**
	 * Le nombre de jetons qu'un joueur a en début de partie
	 */
	public final static int JETONS_PAR_DEFAUT = 21;

	// TODO(fait) corriger le commentaire 
	/**
	 * Le nombre de jetons joués dans la partie
	 */
	

	public int nombreJetonsJoues;
	
	/**
	 *Valeur pour la couleur rouge 
	 */
	
	public final static int COULEUR_JETON_ROUGE = 1;
	
	/**
	 *Valeur pour la couleur jaune
	 */
	
	public final static int COULEUR_JETON_JAUNE = 2;
	

	// TODO(fait) corriger le commentaire 
	/**
	 * La capacité de la grille de puissance 4
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
	public int couleurJetons1;

	/**
	 * la couleur des jetons du joueur 2
	 */
	public int couleurJetons2;

	// TODO (fait) corriger le commentaire 
	// TODO(fait) Ecrire un commentaire plus précis
	/**
	 * Crée une nouvelle partie en initialisant la grille et les jetons
	 */
	public Puissance4()
	{
		this.capaciteGrille = CAPACITE_PAR_DEFAUT;
		this.jetonsJoueur1 = JETONS_PAR_DEFAUT;
		this.jetonsJoueur2 = JETONS_PAR_DEFAUT;
		// TODO(fait) Définir des constantes pour les couleurs
		this.couleurJetons1 = COULEUR_JETON_ROUGE;
		this.couleurJetons2 = COULEUR_JETON_JAUNE;
		this.nombreJetonsJoues = 0;
	}
	
	// TODO(fait) déplacer les méthodes après les constructeurs
	// TODO(fait) corriger le commentaire 
	/**
	 * Joue l'intégralité d'une partie.
	 */
	public void jouer()
	{
		// TODO(fait) corriger les accents
		System.out.println("Partie démarrée");
	}
}
