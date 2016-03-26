package airCountry;

import java.util.ArrayList;

/**
 * Created by papakiri on 22/03/2016.
 */
public interface Coordinable {


    ArrayList<Dimension> getCoordonnes();
    public static double calculerDistance(Coordinable dept, Coordinable dest) throws Exception {
        if (dept.getCoordonnes().size() != dest.getCoordonnes().size()) throw new Exception();
        int dimension = dept.getCoordonnes().size();
        double distancePow = 0.0;
        for (int i = 0; i < dimension; i++) {


            double coordDept = dept.getCoordonnes().get(i).dimensionToNumber().doubleValue();
            double coordDest = dest.getCoordonnes().get(i).dimensionToNumber().doubleValue();
            distancePow += Math.pow(coordDept - coordDest, 2);

        }
        return Math.sqrt(distancePow);
    }



}
