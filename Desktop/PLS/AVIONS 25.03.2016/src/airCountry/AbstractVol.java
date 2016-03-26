package airCountry;

import Matos.Aeroport;

/**
 * Created by papakiri on 22/03/2016.
 */
public abstract class AbstractVol {
    private Aeroport depart;
    private Aeroport destination;

    public AbstractVol(Aeroport depart, Aeroport destination){
        this.depart = depart;
        this.destination = destination;
    }

    public Aeroport getDepart() {
        return depart;
    }

    public Aeroport getDestination() {
        return destination;
    }
}
