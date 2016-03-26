package Matos;

import airCountry.Coordinable;

/**
 * Created by papakiri on 22/03/2016.
 */
public class Aeroport {
    private Coordinable coordonnees;
    private String nom;

    public Aeroport(String nom, Coordinable coordonnees){
        this.nom = nom;
        this.coordonnees = coordonnees;
    }

    public Coordinable getCoordonnees(){
        return this.coordonnees;
    }

    @Override
    public String toString() {
        return nom + " " + this.coordonnees;
    }
}
