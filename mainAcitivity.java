package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText2, editText4, editText6;
        Button btn;
        editText2 = findViewById(R.id.editText2);
        editText4 = findViewById(R.id.editText4);
        editText6 = findViewById(R.id.editText6);
        btn = findViewById(R.id.bottom);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText2.getText().toString());
                int num2 = Integer.parseInt(editText4.getText().toString());
                int result = num1 + num2;

                editText6.setText(String.valueOf(result));
            }
        });

    }
}

