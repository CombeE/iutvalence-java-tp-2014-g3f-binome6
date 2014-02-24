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
	
	
	

	// TODO(fait) corriger le commentaire 
	/**
	 * Le nombre de jetons joués dans la partie
	 */
	

	private int nombreJetonsJoues;
	


	// TODO(fait) corriger le commentaire 
	/**
	 * La capacité de la grille de puissance 4
	 */
	private int capaciteGrille;
	


	// TODO (fait) corriger le commentaire 
	// TODO(fait) Ecrire un commentaire plus précis
	/**
	 * Crée une nouvelle partie en initialisant la grille et les jetons
	 */
	public Puissance4()
	{
		this.capaciteGrille = CAPACITE_PAR_DEFAUT;
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
