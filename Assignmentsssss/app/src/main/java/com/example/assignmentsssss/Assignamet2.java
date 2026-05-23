package com.example.assignmentsssss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.jspecify.annotations.NonNull;

public class Assignamet2 extends AppCompatActivity {
Button click;
EditText nameET;
TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignamet2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                        click = findViewById(R.id.btn);
                        welcome = findViewById(R.id.wel);
                        nameET = findViewById(R.id.nameEt);
                        click.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String name;
                                name = nameET.getText().toString();
                                welcome.setText(welcome.getText().toString() + " " + name);
                            }
                        });
                        return insets;
                    });
                }
            }

