package fr.iutvalence.java.tp.puissance4;

/**
 * Une partie de puissance4.
 */
public class Puissance4 {

	/**
	 * Joue l'intégralité d'une partie.
	 */
	public void jouer(){
		
		System.out.println("Partie démarrée");
		
	}
	
	public final static int CAPACITE_PAR_DEFAUT = 42;
	
	public final static int Jetons_Par_Defauts = 21;
	
	public int CapaciteGrille;
	
	public int JetonsJoueur1;
	
	public int JetonsJoueur2;
	
	/**
	 * Crée une nouvelle partie de puissance4.
	 */

	
	public Puissance4(){
		this.CapaciteGrille = CAPACITE_PAR_DEFAUT ;
		this.JetonsJoueur1 = Jetons_Par_Defauts;
		this.JetonsJoueur2 = Jetons_Par_Defauts;
	}
}
