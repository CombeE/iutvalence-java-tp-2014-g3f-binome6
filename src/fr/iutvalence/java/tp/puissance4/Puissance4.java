package fr.iutvalence.java.tp.puissance4;

// TODO Ecrire un commentaire plus précis
/**
 * Les caractéristiques d'une partie de puissance4 et les actions possibles.
 */
public class Puissance4
{
	/**
	 * Le nombre de ligne jouables dans la grille
	 */
	public final static int NOMBRE_DE_LIGNES = 6;
	/**
	 * Le nombre de colonnes jouables dans la grille
	 */
	public final static int NOMBRE_DE_COLONNES = 7;

	/**
	 * Le nombre de jetons joués dans la partie
	 */
	public int nombreJetonsJoues;

	// TODO(fait) écrire un commentaire plus précis
	/**
	 * Un tableau ou l'on pourra insérer des jetons .
	 */
	private Case[][] grille;
	/**
	 * Le premier joueur
	 */
	private Joueur joueur1;
	/**
	 * Le second joueur
	 */
	private Joueur joueur2;


	/**
	 * 
	 * @param numeroDeColonne
	 *            , une colonne passée en paramètre dont on veut connaitre le
	 *            contenu
	 * @return le contenu de la case situé à la ligne 0 et à la colonne donnée,
	 *         qui permet de savoir si la colonne est pleine
	 */
	private boolean estColonnePleine(int numeroDeColonne)
	{
		return (this.grille[0][numeroDeColonne] == null);
	}

	/**
	 * Crée une nouvelle partie en initialisant la grille et les jetons
	 */
	public Puissance4()
	{
		this.nombreJetonsJoues = 0;
		this.grille = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.grille[numeroDeLigne][numeroDeColonne] = new Case();
			

		System.out.println("Les lignes vont de 0 à 5 et les colonnes de 0 à 6");

		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
	}

	/**
	 * Joue l'intégralité d'une partie. Les joueurs insèrent des jetons, un par
	 * un. Il reste à régler le fait qu'un joueur ait gagné
	 */
	public void jouer()
	{
		
			System.out.println("Partie démarrée");
			System.out.println("Joueur 1 : Jetons rouge");
			System.out.println("Joueur 2 : Jetons jaune");
			int derniereColonneJouee=45;
			while (!this.Gagner(derniereColonneJouee)){
			for (int nombreDeTours = 0; nombreDeTours < NOMBRE_DE_COLONNES * NOMBRE_DE_LIGNES; nombreDeTours++)
			{
				if (nombreDeTours % 2 == 0)
				{
					System.out.println("Joueur 1");
					int numeroDeColonneOuJouer = 0;
					boolean estColonneValide = false;
					while (!estColonneValide)
					{
						numeroDeColonneOuJouer = this.joueur1.obtenirColonneOuJouer();
						estColonneValide = !estColonnePleine(numeroDeColonneOuJouer);
						derniereColonneJouee = numeroDeColonneOuJouer;
					}
					deposerJeton(numeroDeColonneOuJouer, CouleurJeton.ROUGE);
					this.nombreJetonsJoues++;
				}
				else
				{
					System.out.println("Joueur 2");
					int numeroDeColonneOuJouer = 0;
					boolean estColonneValide = false;
					while (!estColonneValide)
					{
						numeroDeColonneOuJouer = this.joueur2.obtenirColonneOuJouer();
						estColonneValide = !estColonnePleine(numeroDeColonneOuJouer);
						derniereColonneJouee = numeroDeColonneOuJouer;

					}
					deposerJeton(numeroDeColonneOuJouer, CouleurJeton.JAUNE);
					this.nombreJetonsJoues++;
				}
			}
		}

	}


	

	
	
	/**
	 * Insère un jeton dans une colonne passée en paramètre
	 * 
	 * @param numeroDeColonne
	 *            la colonne ou l'on va déposer le jeton
	 * @param couleurJeton
	 *            la couleur du jeton que l'on va déposer
	 */
	public boolean deposerJeton(int numeroDeColonne, CouleurJeton couleurJeton)
	{
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			if (this.grille[numeroDeLigne][numeroDeColonne].deposerJeton(couleurJeton))
				return true;

		return false;
	}
	

	/**
	 * Permet de vérifier si une partie a été gagnée ou non
	 */
	public boolean Gagner(int colonneJouee)
	{
		if (this.alignementVertical(colonneJouee)||this.alignementHorizontal(colonneJouee)||this.alignementDiagonal(colonneJouee))
			return true;
		else return false;
	}
	
	/**
	 * 
	 * @return Si il y'a puissance4 à la verticale
	 */
	public boolean alignementVertical(int uneColonne){
		int compteurdejeton=1;
		while()
		return false;
		
	}
	
	public boolean alignementHorizontal(int uneColonne){
		return false;
	}
	
	public boolean alignementDiagonal(int uneColonne){
		return false;
	}
}
