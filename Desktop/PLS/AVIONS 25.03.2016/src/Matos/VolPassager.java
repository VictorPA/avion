package Matos;

import airCountry.AbstractVol;

/**
 * Created by papakiri on 22/03/2016.
 */
public class VolPassager extends AbstractVol {

    String nom;


    public VolPassager(Aeroport depart, Aeroport destination, String nom) {
        super(depart,destination);
        this.nom = nom;
    }

    public String toString(){
        return "Avion n°"+ this.nom+ " ->  Départ : " + super.getDepart() + "| Destination : " + super.getDestination();
    }

}
