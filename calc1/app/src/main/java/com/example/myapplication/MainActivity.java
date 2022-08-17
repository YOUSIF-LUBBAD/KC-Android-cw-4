package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.TEXTVIEW2);
        EditText wv1 = findViewById(R.id.EDITTEXT1);
        EditText iv1 = findViewById(R.id.EDITTEXT2);
        TextView tk1 = findViewById(R.id.TEXTVIEW1);
        Button pv1 = findViewById(R.id.button1);

        pv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Secondnumber = Integer.parseInt(wv1.getText().toString());
                int Firstnumber= Integer.parseInt(iv1.getText().toString());

                int  result = Firstnumber + Secondnumber;
                tk1.setText(String.valueOf(result));
    }
});


}
}