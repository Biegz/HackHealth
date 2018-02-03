package controller;

import stepcookieBackend.Achievement;

/**
 * Created by austin on 2/3/18.
 */

public class GeneralController {

    private Achievement model;

    public GeneralController(Achievement model){
        this.model = model;
    }

    public String getName(){
        return model.getName();
    }

    public String getDescrition(){
        return model.getDescription();
    }

    public Boolean getIsComplete(){
        return model.isComplete();
    }

    public void setInfo(String name, String description ){
        model.setName(name);
        model.setDescription(description);
    }




}
