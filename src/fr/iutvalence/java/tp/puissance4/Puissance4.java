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

	/**
	 * la dernière ligne ou un jeton a été posé, on l'utilise pour vérifier les conditions
	 * de gain du jeu, on l'initialise à 50 car la ligne 50 n'existe pas.
	 */
	public int derniereLigneJouee = 50;
	
	
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

		this.joueur1 = new Joueur(CouleurJeton.ROUGE);
		this.joueur2 = new Joueur(CouleurJeton.JAUNE);
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
			while (!this.Gagner(derniereColonneJouee, this.derniereLigneJouee,this.joueur1.CouleurJoueur )||!this.Gagner(derniereColonneJouee, this.derniereLigneJouee,this.joueur2.CouleurJoueur )){
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
			System.out.println("Partie gagnée");
			if (this.Gagner(derniereColonneJouee, derniereLigneJouee, CouleurJeton.ROUGE))
				System.out.println("Joueur 1 Gagne la partie");
			if (this.Gagner(derniereColonneJouee, derniereLigneJouee, CouleurJeton.JAUNE))
				System.out.println("Joueur 2 Gagne la partie");
	}


	

	
	
	/**
	 * Insère un jeton dans une colonne passée en paramètre
	 * 
	 * @param numeroDeColonne
	 *            la colonne ou l'on va déposer le jeton
	 * @param couleurJeton
	 *            la couleur du jeton que l'on va déposer
	 *            
	 * @return boolean
	 * 			est vrai si un jeton a pu être déposé dans une case
	 */
	public boolean deposerJeton(int numeroDeColonne, CouleurJeton couleurJeton)
	{
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			if (this.grille[numeroDeLigne][numeroDeColonne].deposerJeton(couleurJeton))
				this.derniereLigneJouee=numeroDeLigne;
				return true;
	}
	

	/**
	 * Permet de vérifier si une partie a été gagnée ou non
	 * @param colonneJouee 
	 * @param uneLigne 
	 * @param uneCouleur 
	 * @return est vrai lorsqu'un joueur a gagné une partie de puissance 4
	 */
	public boolean Gagner(int colonneJouee, int uneLigne, CouleurJeton uneCouleur)
	{
		if (this.alignementVertical(colonneJouee, uneLigne, uneCouleur)||this.alignementHorizontal(colonneJouee, uneLigne, uneCouleur)||this.alignementDiagonalMontée(colonneJouee, uneLigne, uneCouleur)||this.alignementDiagonalDescente(colonneJouee, uneLigne, uneCouleur))
			return true;
		else return false;
	}
	


	/**
	 * 
	 * @param uneColonne  
	 * @param uneLigne
	 * @return est vrai si il y a puissance4 à la verticale
	 */
	public boolean alignementVertical(int uneColonne, int uneLigne, CouleurJeton uneCouleur){
		int compteurdejeton=1;
		int ligne;
		ligne=uneLigne;
		while(this.grille[ligne][uneColonne].obtenirCouleurJeton() == uneCouleur)
			ligne++;
			compteurdejeton++;
		if (compteurdejeton == 4)
			return true;
		else return false;
		
	}
	
	/**
	 * 
	 * @param uneColonne
	 * @param uneLigne
	 * @param uneCouleur
	 * @return est vrai si il y a puissance 4 horizontal
	 */
	public boolean alignementHorizontal(int uneColonne, int uneLigne, CouleurJeton uneCouleur){
		int compteurdejeton=1;
		int colonne;
		colonne=uneColonne;
		while(this.grille[uneLigne][colonne].obtenirCouleurJeton() == uneCouleur)
			colonne++;
		while(this.grille[uneLigne][colonne].obtenirCouleurJeton() == uneCouleur)
			colonne--;
			compteurdejeton++;
			if(compteurdejeton == 4)
				return true;
			else return false;
	}
	/**
	 * 
	 * @param uneColonne
	 * @param uneLigne
	 * @param uneCouleur
	 * @return est vrai s'il y a puissance 4 en diagonale vers le nord-est
	 */
	public boolean alignementDiagonalMontée(int uneColonne, int uneLigne, CouleurJeton uneCouleur){
		int compteurdejeton=1;
		int colonne;
		int ligne;
		ligne=uneLigne;
		colonne=uneColonne;
		while(this.grille[ligne][colonne].obtenirCouleurJeton() == uneCouleur)
			colonne++;
			ligne--;
		while(this.grille[ligne][colonne].obtenirCouleurJeton() == uneCouleur)
			colonne--;
			ligne++;
			compteurdejeton++;
			if(compteurdejeton == 4)
				return true;
			else return false;
	}
	
	/**
	 * 
	 * @param uneColonne
	 * @param uneLigne
	 * @param uneCouleur
	 * @return est vrai s'il y a puissance 4 en diagonale vers le sud-ouest
	 */
	private boolean alignementDiagonalDescente(int uneColonne, int uneLigne, CouleurJeton uneCouleur)
	{
		int compteurdejeton=1;
		int colonne;
		int ligne;
		ligne=uneLigne;
		colonne=uneColonne;
		while(this.grille[ligne][colonne].obtenirCouleurJeton() == uneCouleur)
			colonne++;
			ligne++;
		while(this.grille[ligne][colonne].obtenirCouleurJeton() == uneCouleur)
			colonne--;
			ligne--;
			compteurdejeton++;
			if(compteurdejeton == 4)
				return true;
			else return false;
	}
	
	public String toString()
	{
		String puissance4AsciiArt = "";
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++){
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++){
				puissance4AsciiArt += this.grille[numeroDeLigne][numeroDeColonne].toString();
			
			}
		}
		return puissance4AsciiArt;
	}
}
