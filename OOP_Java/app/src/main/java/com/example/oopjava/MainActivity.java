package com.example.oopjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnThrowJab;
    private Button btnThrowUpperCut;
    Boxer myBoxer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThrowJab = findViewById(R.id.btnThrowJab);

        btnThrowUpperCut = findViewById(R.id.btnThrowUpperCut);

        myBoxer = new Boxer(0,400,900);

        //Log.i("MyTag", myBoxer.toString());

        KickBoxer myKickBoxer = new KickBoxer(2,700,20,30,500);

        //Log.i("MyTag", myKickBoxer.toString());

        //myBoxer.punchSpeed = 900;

        //Log.i("MyTag", "Punch Speed: " + myBoxer.punchSpeed + " Punch Power: " + myBoxer.punchPower);

        //myKickBoxer.kickPower = 888;

        //Log.i("MyTag", "Kick Speed: " + myKickBoxer.kickSpeed + " Kick Power: " + myKickBoxer.kickPower);

        //new Boxer().punchPower = 800;
        //new Boxer().punchPower = 200;

        myBoxer.setNumberOfGloves(2);

        myBoxer.getNumberOfGloves();

        Log.i("MyTag", myBoxer.getNumberOfGloves() + "");

        myBoxer.setStamina(40);

        Boxer newBoxer = new Boxer(4,50,80);
        Boxer.setStamina(20);

        Log.i("MyTag", "All Boxers Stamina" + newBoxer.getStamina());


        myBoxer.throwJab();
        myBoxer.throwUpperCut();

    }

    public void throwJabIsClicked(View buttonView) {

        Toast.makeText(MainActivity.this, myBoxer.throwJab(), Toast.LENGTH_LONG).show();

    }

    public void btnThrowUpperCutIsClicked(View buttonView) {
        Toast.makeText(this, myBoxer.throwUpperCut(), Toast.LENGTH_LONG).show();
    }
}