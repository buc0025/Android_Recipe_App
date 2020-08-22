package com.example.reversestring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtString;
    TextView reversedStr;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtString = findViewById(R.id.edtString);
        reversedStr = findViewById(R.id.reversedStr);

        String[] myFavSports = new String[4];
        myFavSports[0] = "Boxing";
        myFavSports[1] = "Judo";
        myFavSports[2] = "Body Building";
        myFavSports[3] = "Karate";

        String arrays = "";
        for (String sportName : myFavSports) {

            arrays += sportName + ", ";
        }

        TextView txtArray = findViewById(R.id.txtArray);
        txtArray.setText(arrays);

    }

    public void reverseWhenClicked(View buttonView) {

        result = "";
        String str = edtString.getText().toString();

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        reversedStr.setText(result);
    }
}
