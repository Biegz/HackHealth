package controller;

import android.widget.TextView;

import stepcookieBackend.Achievement;

import android.support.v7.app.AppCompatActivity;

import com.example.austin.hackhealth.R;

/**
 * Created by austin on 2/3/18.
 */

public class StepController extends AppCompatActivity{
    private Achievement model;


    public StepController(Achievement model){
        this.model = model;
    }

    public Long getSteps(){
        return model.getInternalSteps();
    }


    public void updateView(){
        TextView tv1 = (TextView) findViewById(R.id.textView3);
        tv1.setText(Long.toString(getSteps()));
    }

    public void setSteps(long x){
        model.setInternalSteps(100);
    }





}
