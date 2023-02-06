package entities;

import metier.IPersonne;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {

    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        matricule = generateMatricule();
    }

    public String getMatricule() {
         return matricule;
      }

      public double getMoyenne() {
            return moyenne;
       }

       public void setMoyenne(double moyenne) {
            this.moyenne = moyenne;
        }

     private String generateMatricule(){
        String mat;
        mat = "ET-" + prenom.charAt(0)+((nom.length() < 3) ? "#" : nom.charAt(2)) + prenom.length();
        return mat;
     }


    @Override
    public void saisie() {
        SaisiP();
        matricule = generateMatricule();
        do{
            System.out.print("Donner la moyenne : ");
            Scanner scan = new Scanner(System.in);
            moyenne = scan.nextDouble();
        }while(moyenne < 0 || moyenne > 20);
    }

    @Override
    public void affiche() {
        System.out.print("Nom : "+ nom);
        System.out.println();
        System.out.print("Prenom : "+ prenom);
        System.out.println();
        System.out.print("Matricule : "+ matricule);
        System.out.println();
        System.out.print("Moyenne : "+ moyenne);
        System.out.println();
    }
}
