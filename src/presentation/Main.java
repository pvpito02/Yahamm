package presentation;

import entities.Employe;
import entities.Etudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> ListeEt = new ArrayList<>();
        int nb,Max_Salaire = 0, Min_Salaire = 0;
        double Max_Moy = 0,Min_Moy = 0;
        do{
            System.out.print("Donner le nombre d'etudiant : ");
            Scanner scan = new Scanner(System.in);
            nb = scan.nextInt();
        }while (nb <= 0 );
        System.out.println("Remplissage de la liste d'etudiant :");
        for (int i = 0; i < nb; i++) {
            Etudiant et = new Etudiant();
            et.saisie();
            ListeEt.add(et);
        }

        System.out.println("Affichage du contenu de la liste d'etudiant");
        for (int i = 0; i < ListeEt.size(); i++) {
            System.out.println("Etudiant :" +(i+1));
             ListeEt.get(i).affiche();
        }
        for (int i = 0; i < ListeEt.size(); i++) {
            Max_Moy = ListeEt.get(0).getMoyenne();
            Min_Moy = ListeEt.get(0).getMoyenne();
            if(ListeEt.get(i).getMoyenne() > Max_Moy){
                Max_Moy = ListeEt.get(i).getMoyenne();
            } else if (ListeEt.get(i).getMoyenne() < Min_Moy) {
                Min_Moy = ListeEt.get(i).getMoyenne();
            }
        }
        System.out.println("Moyenne MAX ET MIN de l'etudiant");
        System.out.println("MAX_MOYENNE : "+Max_Moy);
        System.out.println("MIN_MOYENNE : "+Min_Moy);

        // Affichage Autrement de la liste  des etudiants
//        for (Etudiant E : Liste) {
//            E.affiche();
//        }

        System.out.println();
        List<Employe> ListeEm = new ArrayList<>();
        do{
            System.out.print("Donner le nombre d'employer : ");
            Scanner scan = new Scanner(System.in);
            nb = scan.nextInt();
        }while (nb <= 0 );
        System.out.println();
        for (int i = 0; i < nb; i++) {
            Employe em = new Employe();
            em.saisie();
            ListeEm.add(em);
        }
        System.out.println("Affichage de la liste d'employers");
        for (int i = 0; i < ListeEm.size(); i++) {
            System.out.println("Employer : "+(i+1));
            ListeEm.get(i).affiche();
        }
//        for ( Employe em : ListeEm ) {
//            em.affiche();
//        }

        for (int i = 0; i < ListeEm.size(); i++) {
            Max_Salaire = ListeEm.get(0).getSalaire();
            Min_Salaire = ListeEm.get(0).getSalaire();
            if(ListeEm.get(i).getSalaire() > Max_Salaire){
                Max_Salaire = ListeEm.get(i).getSalaire();
            } else if (ListeEt.get(i).getMoyenne() < Min_Salaire) {
                Min_Salaire = ListeEm.get(i).getSalaire();
            }
        }
        System.out.println("Salaire MAX ET MIN dee employers");
        System.out.println("MAX_SALAIRE : "+Max_Salaire);
        System.out.println("MIN_SALAIRE : "+Min_Salaire);
    }
}