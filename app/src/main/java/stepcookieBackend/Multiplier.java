/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepcookieBackend;

/**
 *
 * This class will be used for repeating rewards
 * 
 * @author Dan
 */
public abstract class Multiplier implements Steppable{
    
    protected long internalSteps;
    private String description;
    long price;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getInternalSteps() {
        return internalSteps;
    }

    public void setInternalSteps(long internalSteps) {
        this.internalSteps = internalSteps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    //ImageView 
    
    
}
