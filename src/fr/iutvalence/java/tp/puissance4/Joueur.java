package fr.iutvalence.java.tp.puissance4;

import java.util.Random;

/**
 * Les caractéristiques ainsi que les actions possibles d'un joueur de puissance 4
 * @author ramilijn
 *
 */
public class Joueur
{
	
	public Joueur(CouleurJeton uneCouleur){
		this.CouleurJoueur=uneCouleur;
	}
	/**
	 * La couleur des jetons du joueur
	 */
	public final CouleurJeton CouleurJoueur ;
	
	/**
	 * Demande une colonne de la grille sur laquelle on va poser notre jeton 
	 */
	
	public int obtenirColonneOuJouer()
	{
		return new Random().nextInt(Puissance4.NOMBRE_DE_COLONNES); //On obtient un chiffre aléatoire déterminant la colonne jouée
		
	}
	

	
}
