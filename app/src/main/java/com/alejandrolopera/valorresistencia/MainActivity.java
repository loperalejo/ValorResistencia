package com.alejandrolopera.valorresistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

import static java.lang.Math.pow;


public class MainActivity extends AppCompatActivity {
    Spinner banda,banda2,banda3,banda4;
    int fb,sb,tb,tolerancia;
    double rvalue;
    private TextView value;
    private Button bpbanda, bsbanda, btbanda, bcbanda ;
    DecimalFormat df = new DecimalFormat("#.0");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value=findViewById(R.id.rvalue);
        bsbanda=findViewById(R.id.bsbanda);
        bpbanda=findViewById(R.id.bpbanda);
        btbanda=findViewById(R.id.btbanda);
        bcbanda=findViewById(R.id.bcbanda);
        banda=(Spinner)findViewById(R.id.banda);
        banda2=(Spinner)findViewById(R.id.banda2);
        banda3=(Spinner)findViewById(R.id.banda3);
        banda4=(Spinner)findViewById(R.id.banda4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.codigo_colores, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_tolerance= ArrayAdapter.createFromResource(this, R.array.tolerancia, android.R.layout.simple_spinner_item);
        banda.setAdapter(adapter);
        banda2.setAdapter(adapter);
        banda3.setAdapter(adapter);
        banda4.setAdapter(adapter_tolerance);

        banda3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if(selectedItem.equals("Negro"))
                {
                    tb=0;
                    banda3.setBackgroundResource(R.drawable.imag1);
                    btbanda.setBackgroundResource(R.drawable.banda10);
                }
                if(selectedItem.equals("Cafe"))
                {
                    tb=1;
                    banda3.setBackgroundResource(R.drawable.imag2);
                    btbanda.setBackgroundResource(R.drawable.banda11);
                }
                if(selectedItem.equals("Rojo"))
                {
                    tb=2;
                    banda3.setBackgroundResource(R.drawable.imag3);
                    btbanda.setBackgroundResource(R.drawable.banda12);
                }
                if(selectedItem.equals("Naranja"))
                {
                    tb=3;
                    banda3.setBackgroundResource(R.drawable.imag4);
                    btbanda.setBackgroundResource(R.drawable.banda13);
                }
                if(selectedItem.equals("Amarillo"))
                {
                    tb=4;
                    banda3.setBackgroundResource(R.drawable.imag5);
                    btbanda.setBackgroundResource(R.drawable.banda14);
                }
                if(selectedItem.equals("Verde"))
                {
                    tb=5;
                    banda3.setBackgroundResource(R.drawable.imag6);
                    btbanda.setBackgroundResource(R.drawable.banda15);
                }
                if(selectedItem.equals("Azul"))
                {
                    tb=6;
                    banda3.setBackgroundResource(R.drawable.imag7);
                    btbanda.setBackgroundResource(R.drawable.banda16);
                }
                if(selectedItem.equals("Violeta"))
                {
                    tb=7;
                    banda3.setBackgroundResource(R.drawable.imag8);
                    btbanda.setBackgroundResource(R.drawable.banda17);
                }
                if(selectedItem.equals("Plata"))
                {
                    tb=8;
                    banda3.setBackgroundResource(R.drawable.imag9);
                    btbanda.setBackgroundResource(R.drawable.banda18);
                }
                if(selectedItem.equals("Blanco"))
                {
                    tb=9;
                    banda3.setBackgroundResource(R.drawable.imag10);
                    btbanda.setBackgroundResource(R.drawable.banda1);
                }
                rvalue=(10*fb+sb)*pow(10,tb);
                if(rvalue<1000)
                    value.setText("Resistencia\n= "+df.format(rvalue)+"\nOhms\n+-"+tolerancia+"%");
                if (1000<=rvalue&&rvalue<1000000)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.001)+"\nKOhms\n+-"+tolerancia+"%");
                if (1000000<=rvalue)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.000001)+"\nMOhms\n+-"+tolerancia+"%");
            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
        banda2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if(selectedItem.equals("Negro"))
                {
                    sb=0;
                    banda2.setBackgroundResource(R.drawable.imag1);
                    bsbanda.setBackgroundResource(R.drawable.banda10);
                }
                if(selectedItem.equals("Cafe"))
                {
                    sb=1;
                    banda2.setBackgroundResource(R.drawable.imag2);
                    bsbanda.setBackgroundResource(R.drawable.banda11);

                }
                if(selectedItem.equals("Rojo"))
                {
                    sb=2;
                    banda2.setBackgroundResource(R.drawable.imag3);
                    bsbanda.setBackgroundResource(R.drawable.banda12);
                }
                if(selectedItem.equals("Naranja"))
                {
                    sb=3;
                    banda2.setBackgroundResource(R.drawable.imag4);
                    bsbanda.setBackgroundResource(R.drawable.banda13);
                }
                if(selectedItem.equals("Amarillo"))
                {
                    sb=4;
                    banda2.setBackgroundResource(R.drawable.imag5);
                    bsbanda.setBackgroundResource(R.drawable.banda14);
                }
                if(selectedItem.equals("Verde"))
                {
                    sb=5;
                    banda2.setBackgroundResource(R.drawable.imag6);
                    bsbanda.setBackgroundResource(R.drawable.banda15);
                }
                if(selectedItem.equals("Azul"))
                {
                    sb=6;
                    banda2.setBackgroundResource(R.drawable.imag7);
                    bsbanda.setBackgroundResource(R.drawable.banda16);
                }
                if(selectedItem.equals("Violeta"))
                {
                    sb=7;
                    banda2.setBackgroundResource(R.drawable.imag8);
                    bsbanda.setBackgroundResource(R.drawable.banda17);
                }
                if(selectedItem.equals("Plata"))
                {
                    sb=8;
                    banda2.setBackgroundResource(R.drawable.imag9);
                    bsbanda.setBackgroundResource(R.drawable.banda18);
                }
                if(selectedItem.equals("Blanco"))
                {
                    sb=9;
                    banda2.setBackgroundResource(R.drawable.imag10);
                    bsbanda.setBackgroundResource(R.drawable.banda1);
                }
                rvalue=(10*fb+sb)*pow(10,tb);
                if(rvalue<1000)
                    value.setText("Resistencia\n= "+df.format(rvalue)+"\nOhms\n+-"+tolerancia+"%");
                if (1000<=rvalue&&rvalue<1000000)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.001)+"\nKOhms\n+-"+tolerancia+"%");
                if (1000000<=rvalue)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.000001)+"\nMOhms\n+-"+tolerancia+"%");
            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
        banda.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if(selectedItem.equals("Negro"))
                {
                    fb=0;
                    banda.setBackgroundResource(R.drawable.imag1);
                    bpbanda.setBackgroundResource(R.drawable.banda10);
                }
                if(selectedItem.equals("Cafe"))
                {
                    fb=1;
                    banda.setBackgroundResource(R.drawable.imag2);
                    bpbanda.setBackgroundResource(R.drawable.banda11);
                }
                if(selectedItem.equals("Rojo"))
                {
                    fb=2;
                    banda.setBackgroundResource(R.drawable.imag3);
                    bpbanda.setBackgroundResource(R.drawable.banda12);
                }
                if(selectedItem.equals("Naranja"))
                {
                    fb=3;
                    banda.setBackgroundResource(R.drawable.imag4);
                    bpbanda.setBackgroundResource(R.drawable.banda13);

                }
                if(selectedItem.equals("Amarillo"))
                {
                    fb=4;
                    banda.setBackgroundResource(R.drawable.imag5);
                    bpbanda.setBackgroundResource(R.drawable.banda14);
                }
                if(selectedItem.equals("Verde"))
                {
                    fb=5;
                    banda.setBackgroundResource(R.drawable.imag6);
                    bpbanda.setBackgroundResource(R.drawable.banda15);
                }
                if(selectedItem.equals("Azul"))
                {
                    fb=6;
                    banda.setBackgroundResource(R.drawable.imag7);
                    bpbanda.setBackgroundResource(R.drawable.banda16);
                }
                if(selectedItem.equals("Violeta"))
                {
                    fb=7;
                    banda.setBackgroundResource(R.drawable.imag8);
                    bpbanda.setBackgroundResource(R.drawable.banda17);

                }
                if(selectedItem.equals("Plata"))
                {
                    fb=8;
                    banda.setBackgroundResource(R.drawable.imag9);
                    bpbanda.setBackgroundResource(R.drawable.banda18);
                }
                if(selectedItem.equals("Blanco"))
                {
                    fb=9;
                    banda.setBackgroundResource(R.drawable.imag10);
                    bpbanda.setBackgroundResource(R.drawable.banda1);
                }
                rvalue=(10*fb+sb)*pow(10,tb);
                if(rvalue<1000)
                    value.setText("Resistencia\n= "+df.format(rvalue)+"\nOhms\n+-"+tolerancia+"%");
                if (1000<=rvalue&&rvalue<1000000)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.001)+"\nKOhms\n+-"+tolerancia+"%");
                if (1000000<=rvalue)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.000001)+"\nMOhms\n+-"+tolerancia+"%");
            }

            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

        banda4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if(selectedItem.equals("Cafe"))
                {
                    tolerancia=1;
                    banda4.setBackgroundResource(R.drawable.imag2);
                    bcbanda.setBackgroundResource(R.drawable.banda11);

                }
                if(selectedItem.equals("Rojo"))
                {
                    tolerancia=2;
                    banda4.setBackgroundResource(R.drawable.imag3);
                    bcbanda.setBackgroundResource(R.drawable.banda12);

                }
                if(selectedItem.equals("Oro"))
                {
                    tolerancia=5;
                    banda4.setBackgroundResource(R.drawable.oro);
                    bcbanda.setBackgroundResource(R.drawable.bandaoro);
                }
                if(selectedItem.equals("Plata"))
                {
                    tolerancia=10;
                    banda4.setBackgroundResource(R.drawable.imag9);
                    bcbanda.setBackgroundResource(R.drawable.banda18);
                }

                rvalue=(10*fb+sb)*pow(10,tb);
                if(rvalue<1000)
                    value.setText("Resistencia\n= "+df.format(rvalue)+"\nOhms\n+-"+tolerancia+"%");
                if (1000<=rvalue&&rvalue<1000000)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.001)+"\nKOhms\n+-"+tolerancia+"%");
                if (1000000<=rvalue)
                    value.setText("Resistencia=\n"+df.format(rvalue*0.000001)+"\nMOhms\n+-"+tolerancia+"%");
            }
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

    }
}
