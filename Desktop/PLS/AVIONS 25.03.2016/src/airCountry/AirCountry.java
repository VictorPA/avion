package airCountry;

import Matos.Aeroport;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by papakiri on 22/03/2016.
 */

public class AirCountry {

    private ArrayList<AbstractVol> listeVols;

    public AirCountry() {
        listeVols = new ArrayList<AbstractVol>();
    }


    public void addVol(AbstractVol vol) {
        listeVols.add(vol);
    }


    public double distanceVol(AbstractVol vol) throws Exception {
        Aeroport dept = vol.getDepart();
        Aeroport dest = vol.getDestination();
        return Coordinable.calculerDistance(dept.getCoordonnees(), dest.getCoordonnees());

    }

    public ArrayList<AbstractVol> getListeVols() {
        return this.listeVols;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        try {
            String message = "";
            for (AbstractVol v : listeVols) {

                message += v + " Distance du vol : " + df.format(distanceVol(v)) + " km.\n";
            }

            return message;
        } catch (Exception e) {
            e.printStackTrace();
            return "Erreur";

        }


    }


}