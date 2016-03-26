package utilite;

import airCountry.Coordinable;
import airCountry.Dimension;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by papakiri on 22/03/2016.
 */


public class Coordonn�esCart�siennes implements Coordinable {

    private ArrayList<Dimension> coordonn�s;

    public Coordonn�esCart�siennes(Dimension... coordonn�) {
        coordonn�s = new ArrayList<>();
        Collections.addAll(coordonn�s, coordonn�);
    }

    public Coordonn�esCart�siennes(Number... coordonn�) {

        this(genererDimension(coordonn�));

    }


    private static DimensionNumber[] genererDimension(Number[] a) {

        DimensionNumber[] dimensions = new DimensionNumber[a.length];
        for (int i = 0; i < a.length; i++) {
            dimensions[i] = new DimensionNumber(a[i]);

        }
        return dimensions;
    }

    public ArrayList<Dimension> getCoordonnes() {

        return this.coordonn�s;

    }


    @Override
    public String toString() {
        String s = "";
        boolean first = true;
        for (Dimension e : coordonn�s) {
            if (first) {
                s += "(" + e;
                first = false;
            } else {
                s += "," + e;

            }


        }
        s += ")";
        return s;

    }
}

