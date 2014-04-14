package fr.iutvalence.java.tp.puissance4;

public class Case
{
	/**
	 * La couleur du jeton occupant la case (<tt>null</tt> si pas de jeton)
	 */
	private CouleurJeton couleurJeton;
	
	public Case()
	{
		this.couleurJeton = null;
	}
	
	public CouleurJeton obtenirCouleurJeton()
	{
		return this.couleurJeton;
	}
	
	/**
	 * permet de déposer un Jeton dans une case
	 * @param couleurJeton la couleur du jeton qu'on va déposer
	 * @return vrai si le jeton a pu être déposer
	 */
	public boolean deposerJeton(CouleurJeton couleurJeton)
	{
		if (this.couleurJeton != null) return false;
		this.couleurJeton = couleurJeton;
		return true;
	}
	
	public String toString(){
		if (this.couleurJeton == CouleurJeton.ROUGE) return "R";
		if (this.couleurJeton == CouleurJeton.JAUNE) return "J";
		else return "x";
				
	}
}
