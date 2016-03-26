package Appli;

import Matos.VolPassager;
import Matos.Aeroport;
import airCountry.AirCountry;
import utilite.Coordonn�esCart�siennes;

/**
 * Created by papakiri on 22/03/2016.
 */
public class AppliA {
    public static void main(String[] args) {

        AirCountry airCountry = new AirCountry();

        Aeroport cdg = new Aeroport("Charles de Gaulle",new Coordonn�esCart�siennes(1,2,1));
        Aeroport orly = new Aeroport("Orly",new Coordonn�esCart�siennes(17,180,50));
        Aeroport venizelos = new Aeroport("Venizelos",new Coordonn�esCart�siennes(70,46,89));



        VolPassager vol1 = new VolPassager(cdg, orly, "6969");

        VolPassager vol3 = new VolPassager(venizelos, orly, "1647");
        VolPassager vol4 = new VolPassager(cdg, venizelos, "9790");

        airCountry.addVol(vol1);

        airCountry.addVol(vol3);
        airCountry.addVol(vol4);

        try {
            System.out.println(airCountry);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
