package fr.iutvalence.java.tp.puissance4;

// TODO(fait) Ecrire un commentaire
/**
 * Permet de faire démarrer une partie de Puissance4 
 */
public class LanceurDePuissance4
{
	// TODO(fait) Ecrire un commentaire
	/**
	 * Nécessaire lors de l'exécution de l'application
	 */
	public static void main(String[] args)
	{
		// TODO(fait) corriger les accents
		System.out.println("Création d'une partie de Puissance 4");

		Puissance4 PartieDePuissance4 = new Puissance4();

		System.out.println("Demarrage de la partie");

		PartieDePuissance4.jouer();

		System.out.println("Fin de la partie");
	}

}
