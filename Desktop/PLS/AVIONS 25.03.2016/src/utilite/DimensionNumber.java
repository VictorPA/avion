package utilite;

import airCountry.Dimension;

/**
 * Created by user on 23/03/2016.
 */
public class DimensionNumber extends Dimension {

    private Number dou;

    public DimensionNumber(Number dou){

        this.dou = dou;


    }



    @Override
    public Number dimensionToNumber() {
        return this.dou;
    }

    @Override
    public String toString() {
        return this.dou.toString();
    }
}
