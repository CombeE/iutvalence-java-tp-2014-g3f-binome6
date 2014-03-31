package fr.iutvalence.java.tp.puissance4;

public class Case
{
	/**
	 * La couleur du jeton occupant la case (<tt>null</tt> si pas de jeton)
	 */
	private CouleurJeton couleurJeton;
	/***
	 * Indicateur de case vide
	 */
	public static Boolean estVide;
	
	public Case()
	{
		this.estVide = true;
		this.couleurJeton = null;
	};
	
	public CouleurJeton obtenirCouleurJeton()
	{
		return this.couleurJeton;
	}
	
	public boolean deposerJeton(CouleurJeton couleurJeton)
	{
		if (this.couleurJeton != null) return false;
		this.couleurJeton = couleurJeton;
		return true;
	}
	
}
