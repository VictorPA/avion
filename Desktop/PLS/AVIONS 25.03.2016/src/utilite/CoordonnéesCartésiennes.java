package utilite;

import airCountry.Coordinable;
import airCountry.Dimension;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by papakiri on 22/03/2016.
 */


public class CoordonnéesCartésiennes implements Coordinable {

    private ArrayList<Dimension> coordonnés;

    public CoordonnéesCartésiennes(Dimension... coordonné) {
        coordonnés = new ArrayList<>();
        Collections.addAll(coordonnés, coordonné);
    }

    public CoordonnéesCartésiennes(Number... coordonné) {

        this(genererDimension(coordonné));

    }


    private static DimensionNumber[] genererDimension(Number[] a) {

        DimensionNumber[] dimensions = new DimensionNumber[a.length];
        for (int i = 0; i < a.length; i++) {
            dimensions[i] = new DimensionNumber(a[i]);

        }
        return dimensions;
    }

    public ArrayList<Dimension> getCoordonnes() {

        return this.coordonnés;

    }


    @Override
    public String toString() {
        String s = "";
        boolean first = true;
        for (Dimension e : coordonnés) {
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

