/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend;

import java.util.Calendar;

/**
 *
 * @author Dan
 */
public abstract class Achievement implements Steppable{
    
    protected long internalSteps;
    protected String description;
    protected String name;
    protected boolean isComplete;
    
    public Calendar timeStarted;

    public long getInternalSteps() {
        return internalSteps;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public Calendar getTimeStarted() {
        return timeStarted;
    }

    public void setInternalSteps(long internalSteps) {
        this.internalSteps = internalSteps;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public void setTimeStarted(Calendar timeStarted) {
        this.timeStarted = timeStarted;
    }
    
}
