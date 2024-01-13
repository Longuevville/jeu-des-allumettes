

package jeuAllumettes;


import java.util.Scanner;

import java.util.Random;

public class jeuAllumettes {

	public static void main(String[] args) {
		// affiché message dee bienvenu dans le jeu
		// deemander nom du joueur 1
		// lire reponse nom du joueur + reponse
		// demander nom du joueeur 2
		// lire reponse nom du jouur + reponse
		// evidement le tout dans un string
		//demander qui commence la game
		//generer tas d'allumettes avec un int des familles qui sera a 21
		//affiché etat initial du jeu quand superiueur a zero boucle while
		// affiché les allumettes qui restes
		// demander au joueur actuel de jouer. Créer une variable joueurActuel == pour joueur 1 
		// dans une condition if  
		// idée avec opperateur || pour savoir si c'est joueur 1 ou joueur 2
		//&& sera affecté !ordinateur
		// faire un systeeme pour changer de joueur
		// dire le gagnant
		// ferme le scanner sinon souci !
		// creer methode pour gerer tour humain dans une private static comme pour chevaux
		// valider le choix d'un joueur dans une boucle while
		// methode pour validé le choix d'un joueur
		// update tas des allumettes par while
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		//les joueurs players ici
		System.out.println("bienvenue les gars dans le jeu des allumettes");
		
		System.out.println("Pseudo player 1 : ");
			String player1 = scan.nextLine();
		
		System.out.println("pseeudo player 2 :");
			String player2 = scan.nextLine();
		
		System.out.println("Qui commence la game ? (1 pour "+player1+", 2 pour "+player2+ ") :");
        	int joueurActuel = scan.nextInt();

		//le tas d'allumettes
		
		int tasDeallumettes = 21;
		
		// allumettes restantes
		while (tasDeallumettes > 0) {
		System.out.println(" Allumettes qui restes : " + tasDeallumettes);	
		
		 // Demander au joueur actuel de jouer
        if (joueurActuel == 1 || (joueurActuel == 2 && !isIA())) {
            tasDeallumettes = jouerTour(player1, tasDeallumettes, scan);
        } else {
            tasDeallumettes = playTourIa(player2, tasDeallumettes);
        }
			
        
        //system changement dee joueur
        joueurActuel = (joueurActuel == 1) ? 2 : 1;

		}
		
		//annoncer qui a gagner 
        System.out.println("Le joueur " + joueurActuel + " (" + ((joueurActuel == 1) ? player1 : player2) + ") a perdu !");
        
        // fermeture du scanner
        scan.close();

	}
		private static int playTourIa(String player2, int tasDeallumettes) {
		// TODO Auto-generated method stub
		return 0;
	}
		private static boolean isIA() {
		// TODO Auto-generated method stub
		return false;
	}
		// methode pour le comportement humain
		private static int jouerTour(String namePlayer, int tasDeallumettes, Scanner scan ) {
			System.out.println("namePlayer + nombre d'allumettes à retiré  (entre 1 et 4): ");
			int choice = scan.nextInt();
		
		
		// validé le choix du joueur
		
		while(choice < 1 || choice > 4 || choice > tasDeallumettes) {
			System.out.println("choix pas choisis entre 1 et 4 et ne depasse pas le nombre qui reste");
			System.out.print(namePlayer + ", Combien d'allumettes veux tu enlever le pyromane ? (entre 1 et 4) : ");
			choice = scan.nextInt();
		
		 // update tas des allumettes par soustraction
		 tasDeallumettes -= choice;
		 
		 return tasDeallumettes;
		 
		}
		
		//Methode ia 
		
	private static int jouerTourOrdi(String nomAfred, int tasDeallumettes ) {
		Random rand = new Random();
	}
	

}
}
