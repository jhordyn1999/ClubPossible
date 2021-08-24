package com.example.clubpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.clubpossible.Controlador.Movimiento;

public class Trasferencia extends AppCompatActivity implements View.OnClickListener {
    FrameLayout viewPager;
    TextView btnTransferir;
    EditText et_estab;
  //String estab = getIntent().getStringExtra("establecimiento");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasferencia);
btnTransferir = findViewById(R.id.btntransferir);
et_estab = findViewById(R.id.et_estab);
   //et_estab.setText(estab);


    btnTransferir.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btntransferir) {
            startActivity(new Intent(Trasferencia.this, TransferenciaFinal.class));

        }
    }
}