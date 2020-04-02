package com.example.imgrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    TextView letrero;
    Button btn;
    int sr;
    int s;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //asociando atributos, id, layout
        imagen = (ImageView) findViewById(R.id.imageView);
        letrero = (TextView) findViewById(R.id.texto);
        btn = (Button) findViewById(R.id.button);
        mostrarRand();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarRand();
            }
        });
    }
    //mostrar valores de aleatorio
    public void mostrarRand() {
        //randoms();
        temp=sr;
        sr = ThreadLocalRandom.current().nextInt(0,6);
        while(temp==sr){
            sr = ThreadLocalRandom.current().nextInt(0,6);
        }
        imagen.setImageResource(randArray[sr].getImagen());
        letrero.setText(randArray[sr].getAleatorio());

    }

    aleatorio i1 = new aleatorio(R.drawable.uno, "img 1");
    aleatorio i2 = new aleatorio(R.drawable.dos, "img 2");
    aleatorio i3 = new aleatorio(R.drawable.tres, "img 3");
    aleatorio i4 = new aleatorio(R.drawable.cuatro, "img 4");
    aleatorio i5 = new aleatorio(R.drawable.cinco, "img 5");
    aleatorio i6 = new aleatorio(R.drawable.seis, "img 6");
    aleatorio i7 = new aleatorio(R.drawable.siete, "img 7");

    //llenando array
    aleatorio[] randArray = new aleatorio[]{
            i1, i2, i3, i4, i5, i6, i7
    };
    //metodo para permutar aleatoriamente una lista, utilizando como fuente el vector randArray
    public void randoms(){
      //  Collections.shuffle(Arrays.asList(randArray));
    }
}
