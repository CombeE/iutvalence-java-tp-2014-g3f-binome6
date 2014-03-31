package fr.iutvalence.java.tp.puissance4;

/**
 * Contenu possible des cases
 */
public enum CouleurJeton
{
	/** La couleur rouge */
	ROUGE,
	
	/** La couleur Jaune. */
	JAUNE;

	/**
	 * nous permet de savoir la couleur du jeton du joueur actuel
	 * @param numeroDuJoueur le joueur actuel
	 * @return la couleur du jeton du joueur actuel
	 */
	public static CouleurJeton obtenirCouleurDuJoueurParNumero(int numeroDuJoueur)
	{
		if (numeroDuJoueur == 1)
			return ROUGE;
		else
			return JAUNE;
	}
}