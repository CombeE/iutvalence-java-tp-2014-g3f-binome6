package fr.iutvalence.java.tp.puissance4;

public class Condition {

	public void Condition()
	{
		
	}
	/**
	 * Permet de vérifier si une partie a été gagnée ou non
	 */
	public boolean Gagner()
	{
		if (this.alignementVertical||this.alignementHorizontal||this.alignementDiagonal)
			return true;
	}
	/**
	 * 
	 * @return Si il y'a puissance4 à la verticale
	 */
	public boolean alignementVertical(){
		
	}
}
