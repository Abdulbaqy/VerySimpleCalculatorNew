package com.ranggawiratno.verysimplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ActivityUtama extends AppCompatActivity {

    private EditText edtAPertama, edtAKedua = null;
    private Button btnP = null;
    private Spinner spOperasi = null;
    private TextView tOutput = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        //sambungin XML dengan Java nya dulu
        edtAPertama = (EditText) findViewById(R.id.edtAngkaPertama);
        edtAKedua = (EditText) findViewById(R.id.edtAngkaKedua);
        btnP = (Button) findViewById(R.id.btnProses);
        spOperasi = (Spinner) findViewById(R.id.spinPilihan);
        tOutput = (TextView) findViewById(R.id.txtOutput);

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer pertama = Integer.parseInt(edtAPertama.getText().toString());
                Integer kedua = Integer.parseInt(edtAKedua.getText().toString());
                Integer result = 0;

                String pilihan = spOperasi.getSelectedItem().toString();

                switch (pilihan){
                    case "Tambah":
                        result = pertama + kedua;
                        break;
                    case "Kurang":
                        result = pertama - kedua;
                        break;
                    case "Kali":
                        result= pertama * kedua;
                        break;
                    case "Bagi":
                        result= pertama / kedua;
                        break;
                }
                if(null != tOutput){
                    tOutput.setText(result.toString());
                }
            }
        });
    }
}
