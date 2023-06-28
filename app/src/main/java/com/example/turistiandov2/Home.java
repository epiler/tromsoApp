package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitios);

        //detectando eventos
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "hice clic", Toast.LENGTH_SHORT).show();
            }
        });

    }
}