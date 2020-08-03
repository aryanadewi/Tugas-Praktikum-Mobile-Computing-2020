package com.tugaspraktikum.basketcounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;

    Button tambah, kurang, reset;
    TextView nilai;
    MainActivity context;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();

        context = this;

        tambah = (Button) tambah.findViewById(R.id.btnTambah);
        kurang = (Button) kurang.findViewById(R.id.btnKurang);
        reset  = (Button) reset.findViewById(R.id.btnReset);
        nilai  = (TextView) nilai.findViewById(R.id.txtNilai);

        nilai.setText("" + counter);

        tambah.setOnClickListener(new View.OnClickListener(){

            @SuppressLint("SetTextI18n")
            public void onClick(View v){
                counter++;
                nilai.setText("" + counter);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener(){

            @SuppressLint("SetTextI18n")
            public void onClick(View v){
                counter--;
                nilai.setText("" + counter);
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){

            @SuppressLint("SetTextI18n")
            public void onClick(View v){
                counter = 0;
                nilai.setText("" + counter);
            }
        });
    }

    private void setContentView() {
    }
}