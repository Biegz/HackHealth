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
public class Every10Steps extends Achievement{
    public Every10Steps(){
        setName("Mad Hops");
        setDescription("Get an extra point every 10 steps");
        setInternalSteps(0);
    }

    @Override
    public int step() {
        internalSteps++;
        if(internalSteps % 100 == 0){
            return 1;
        }
        return 0;
    }

    @Override
    public double progress() {
        long stepsToNextReward = internalSteps%100;
        return stepsToNextReward/100d;
    }

}
