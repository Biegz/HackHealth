/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend.Multipliers;

import stepcookieBackend.Achievement;

/**
 *
 * @author Dan
 */
public class OneHundredPerStep extends Achievement{
    public OneHundredPerStep(){
        setName("One Man Army");
        setDescription("Get an extra 100 points every steps");
        setInternalSteps(0);
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
