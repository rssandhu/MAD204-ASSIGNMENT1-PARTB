/**
 * MAD204 – Assignment 1 PARTB
 * Name: Ramandeep Singh
 * Student ID: A00194321
 * Date of Submission: 05/10/2025
 *
 * Description:
 * MainActivity manages user interaction for introduction app:
 * collects user input, validates it, and shows introduction or error messages.
 */

package com.example.introapp;  // use your app package

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etAge, etProgram;
    private Button btnIntroduce;
    private TextView tvOutput;

    /**
     * onCreate is called when the activity is starting.
     * Initialize UI elements and set button listener.
     * @param savedInstanceState saved state bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect UI elements to class variables
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etProgram = findViewById(R.id.etProgram);
        btnIntroduce = findViewById(R.id.btnIntroduce);
        tvOutput = findViewById(R.id.tvOutput);

        // Set onClick listener for the button
        btnIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduceUser();
            }
        });
    }

    /**
     * Reads and validates input, updates tvOutput with introduction or error message.
     */
    private void introduceUser() {
        String name = etName.getText().toString().trim();
        String ageStr = etAge.getText().toString().trim();
        String program = etProgram.getText().toString().trim();

        // Input validation
        if (name.isEmpty()) {
            tvOutput.setText("Error: Name cannot be empty.");
            return;
        }
        if (ageStr.isEmpty()) {
            tvOutput.setText("Error: Age cannot be empty.");
            return;
        }
        int age;
        try {
            age = Integer.parseInt(ageStr);
            if (age <= 0) {
                tvOutput.setText("Error: Age must be greater than zero.");
                return;
            }
        } catch (NumberFormatException e) {
            tvOutput.setText("Error: Age must be a valid number.");
            return;
        }
        if (program.isEmpty()) {
            tvOutput.setText("Error: Program cannot be empty.");
            return;
        }

        // All inputs valid - show introduction message
        String message = "Hello, my name is " + name + ", I am " + age + " years old, and I study " + program + ".";
        tvOutput.setText(message);
    }
}
