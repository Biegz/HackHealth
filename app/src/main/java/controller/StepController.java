package controller;

import android.widget.TextView;

import stepcookieBackend.Achievement;

import android.support.v7.app.AppCompatActivity;

import com.example.austin.hackhealth.R;

/**
 * Created by austin on 2/3/18.
 */

public class StepController extends AppCompatActivity{

    private StepCounterController pedometerController;
    private GeneralController gc;

    public StepController(GeneralController gc){
        this.gc = gc;
        pedometerController = new StepCounterController(this);
    }

    public void step() {
        this.gc.incrementSteps();
        updateView();
    }

    public void updateView(){
        TextView tv1 = (TextView) findViewById(R.id.textView3);
        tv1.setText(Long.toString(gc.getSteps()));
    }
}
