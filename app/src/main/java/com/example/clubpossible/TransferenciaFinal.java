package com.example.clubpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TransferenciaFinal extends AppCompatActivity implements View.OnClickListener {
TextView btncontinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferencia_final);
        btncontinuar = findViewById(R.id.btncontinuar);

        btncontinuar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btncontinuar) {
            startActivity(new Intent(TransferenciaFinal.this, MainActivity.class));

        }
    }
}