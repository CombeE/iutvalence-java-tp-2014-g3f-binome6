package fr.iutvalence.java.tp.puissance4;

public class Condition {

	public void Condition()
	{
		
	}
	/**
	 * Permet de vérifier si une partie a été gagnée
	 */
	public boolean Gagner()
	{
		if (this.alignementVertical||this.alignementHorizontal||this.alignementDiagonal)
			return true;
	}
	
	public boolean alignementVertical(){
		
	}
}
