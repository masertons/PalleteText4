package com.example.mochamadwiby.aplikasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hitung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);

        Button btn_tambah = (Button) findViewById(R.id.btn_tambah);
        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inAngka1 = (EditText) findViewById(R.id.inAngka1);
                EditText inAngka2 = (EditText) findViewById(R.id.inAngka2);
                int angka1 = Integer.parseInt(inAngka1.getText().toString());
                int angka2 = Integer.parseInt(inAngka2.getText().toString());
                int hasilTambah = angka1 + angka2;
                TextView view_hasil_tambah = (TextView) findViewById(R.id.view_hasil_tambah);
                view_hasil_tambah.setText(hasilTambah + "");
            }
        });
    }
}
