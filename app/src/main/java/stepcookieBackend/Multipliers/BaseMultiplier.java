package stepcookieBackend.Multipliers;

import stepcookieBackend.Multiplier;

/**
 * Created by Dan on 2/3/2018.
 */

public class BaseMultiplier extends Multiplier {

    public BaseMultiplier(){
        setName("Own Two Feet");
        setDescription("Get an extra point every steps");
        setInternalSteps(0);
        setPrice(0);
    }

    @Override
    public int step() {
        internalSteps++;
        return 1;
    }

    @Override
    public double progress() {
        return 1;
    }

}
