package com.example.assign4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgp;
    RadioButton rbtn;
    TextView outputdevice, outputfeatures;
    Button btn;
    CheckBox ch1, ch2, ch3, ch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            btn = findViewById(R.id.btn);
            rgp = findViewById(R.id.rgdev);
            ch1 = findViewById(R.id.notify);
            ch2 = findViewById(R.id.dm);
            ch3 = findViewById(R.id.loc);
            ch4 = findViewById(R.id.cb);
            outputdevice = findViewById(R.id.device);
            outputfeatures = findViewById(R.id.features);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int selecteddevice = rgp.getCheckedRadioButtonId();
                    rbtn = findViewById(selecteddevice);

                    outputdevice.setText("Selected Device : " + rbtn.getText().toString());

                    String feature = "";
                    if (ch1.isChecked())
                        feature += ch1.getText().toString() + " ";
                    if (ch2.isChecked())
                        feature += ch2.getText().toString() + " ";
                    if (ch3.isChecked())
                        feature += ch3.getText().toString() + " ";
                    if (ch4.isChecked())
                        feature += ch4.getText().toString() + " ";

                    outputfeatures.setText("Selected App Features : " + feature);
                }
            });
            return insets;
        });
    }
}
