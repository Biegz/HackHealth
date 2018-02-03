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
public class EightPerStep extends Multiplier {
    public EightPerStep(){
        setName("Spider Legs");
        setDescription("Get an extra 8 points every step");
        setInternalSteps(0);
    }

    @Override
    public int step() {
        internalSteps++;
        return 8;
    }

    @Override
    public double progress() {
        return 1;
    }
}
