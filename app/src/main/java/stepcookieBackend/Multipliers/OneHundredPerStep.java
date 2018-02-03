/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend.Multipliers;

import stepcookieBackend.Achievement;
import stepcookieBackend.Multiplier;

/**
 *
 * @author Dan
 */
public class OneHundredPerStep extends Multiplier {
    public OneHundredPerStep(){
        setName("One Man Army");
        setDescription("Get an extra 100 points every steps");
        setInternalSteps(0);
        setPrice(50000000);
    }

    @Override
    public int step() {
        internalSteps++;
        return 100;
    }

    @Override
    public double progress() {
        return 1;
    }
}
