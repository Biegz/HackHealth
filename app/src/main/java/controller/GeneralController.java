package controller;

import java.util.ArrayList;
import java.util.List;

import stepcookieBackend.Achievement;
import stepcookieBackend.Multiplier;
import stepcookieBackend.Shop;
import stepcookieBackend.Steppable;

/**
 * Created by austin on 2/3/18.
 */

public class GeneralController {

    Shop shop;
    StepController sc;

    public long steps;
    public long points;

    private String name;

    List<Achievement> achiements;
    List<Multiplier> multipliers;

    List<Steppable> steppables;

    public GeneralController(){

        this.shop =  new Shop(this);
        this.sc = new StepController(this);

        achiements = new ArrayList<>();
        multipliers = new ArrayList<>();
        steppables = new ArrayList<>();
    }

    public void incrementSteps() {
        steps++;
        updateValues();
    }

    private void updateValues() { //Update progress bars
        for (Steppable s : steppables) {
            points += s.step();
        }
    }

    private void purchase(Shop.Item item){
        shop.buyItem(item);
    }

    public long getSteps() {
        return steps;
    }

    public long getPoints() {
        return points;
    }

    public void addMultiplier(Multiplier item) {
        multipliers.add(item);
        steppables.add(item);
    }

    public void removePoints(long val) {
        points -= val;
    }
}
