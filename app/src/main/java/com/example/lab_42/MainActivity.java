package com.example.lab_42;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtMain;
    private TextView lblMain;
    private Button btnMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtMain = findViewById(R.id.txtMain);
        this.lblMain = findViewById(R.id.lblMain);
        this.btnMain = findViewById(R.id.btnMain);

        this.btnMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String inputString = txtMain.getText().toString();
                lblMain.setText(Utils.removeExcessiveSpacesFromString(inputString));
            }
        });
    }
}
