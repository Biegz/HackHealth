package stepcookieBackend;

import controller.GeneralController;
import stepcookieBackend.Multipliers.EightPerStep;
import stepcookieBackend.Multipliers.Every100Steps;
import stepcookieBackend.Multipliers.Every10Steps;
import stepcookieBackend.Multipliers.EveryStep;
import stepcookieBackend.Multipliers.OneHundredPerStep;

/**
 * Created by Dan on 2/3/2018.
 */

public class Shop {

    public enum Item{
        EVERY_100,
        EVERY_10,
        EVERY_STEP,
        EIGHT_PER,
        HUNDRED_PER
    }

    private GeneralController gc;

    public Shop(GeneralController gc){
        this.gc = gc;
    }

    public void buyItem(Item i){

        Multiplier item = null;
        long price;

        switch (i){
            case EVERY_100: item = new Every100Steps();
                break;
            case EVERY_10: item = new Every10Steps();
                break;
            case EVERY_STEP: item = new EveryStep();
                break;
            case EIGHT_PER: item = new EightPerStep();
                break;
            case HUNDRED_PER: item = new OneHundredPerStep();
        }
        if(item!=null) {
            price = item.getPrice();
            if(gc.getPoints() - price >= 0){
                gc.removePoints(price);
                gc.addMultiplier(item);
            }
        }
    }

}
