package stepcookieBackend.Multipliers;

import stepcookieBackend.Multiplier;
import stepcookieBackend.Steppable;

/**
 * Created by Dan on 2/3/2018.
 */

public class MutiplierWrapper <T extends Multiplier> implements Steppable {

    T steppable;
    int numItems;

    public MutiplierWrapper(T steppable){
        this.steppable = steppable;
        numItems = 1;
    }

    public void addItem(){
        numItems++;
    }


    @Override
    public int step() {
        return steppable.step() * numItems;
    }

    @Override
    public double progress() {
        return steppable.progress();
    }
}
