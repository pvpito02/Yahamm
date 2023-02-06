package entities;

import java.util.Scanner;

public class Personne {
    protected String nom;
    protected  String prenom;

    public Personne() {

    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void SaisiP(){
        Scanner saisie = new Scanner(System.in);
        System.out.println("Donner le nom :");
        nom = saisie.nextLine();
        System.out.println("Donner le prenom :");
        prenom = saisie.nextLine();
    }
}
