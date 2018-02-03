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
public class ThousandDaily extends Achievement{
    public ThousandDaily(){
        setName("One Thousand Steps");
        setDescription("Get 500 points every day you walk 1000 steps!");
        setInternalSteps(0);
        setIsComplete(false);
    }

    @Override
    public int step() {
        
        if(isComplete()){
            return 0;
        }
        
        internalSteps++;
        if(internalSteps == 1000){
            setIsComplete(true);
            return 500;
        }
        return 0;
    }

    @Override
    public double progress() {
        long stepsToNextReward = internalSteps%1000;
        return stepsToNextReward/1000d;
    }
}
