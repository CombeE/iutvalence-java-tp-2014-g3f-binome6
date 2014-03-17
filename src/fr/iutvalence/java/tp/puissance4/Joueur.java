package fr.iutvalence.java.tp.puissance4;

/**
 * Les caractéristiques ainsi que les actions possibles d'un joueur de puissance 4
 * @author ramilijn
 *
 */
public class Joueur
{
	/**
	 * Demande une colonne de la grille sur laquelle on va poser notre jeton 
	 */
	
	public int obtenirColonneOuJouer()
	{
		int random = (int)(Math.random() * (7));
		return random; //On obtient un chiffre aléatoire déterminant la colonne jouée
		
	}
}
