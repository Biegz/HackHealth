/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend.Multipliers;

import stepcookieBackend.Multiplier;

/**
 *
 * @author Dan
 */
public class EveryStep extends Multiplier {

    public EveryStep(){
        setName("Peg Leg");
        setDescription("Get an extra point every step");
        setInternalSteps(0);
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
