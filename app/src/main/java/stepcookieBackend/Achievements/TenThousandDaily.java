/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend.Achievements;

import stepcookieBackend.Achievement;

/**
 *
 * @author Dan
 */
public class TenThousandDaily extends Achievement{

    public TenThousandDaily(){
        setName("Ten Thousand Steps");
        setDescription("Get 7500 points every day you walk 10000 steps!");
        setInternalSteps(0);
        setIsComplete(false);
    }

    @Override
    public int step() {

        if(isComplete()){
            return 0;
        }

        internalSteps++;
        if(internalSteps == 10000){
            setIsComplete(true);
            return 7500;
        }
        return 0;
    }

    @Override
    public double progress() {
        long stepsToNextReward = internalSteps%10000;
        return stepsToNextReward/10000d;
    }
    
}
