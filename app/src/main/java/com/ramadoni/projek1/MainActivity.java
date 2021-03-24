package com.ramadoni.projek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtAlamat, edtJurusan, edtNoTelpon;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNPMNamaDanAlamatJurusanNoTelpon);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtJurusan = (EditText) findViewById(R.id.edtJurusan);
        edtAlamat =(EditText) findViewById(R.id.edtAlamat);
        edtNoTelpon =(EditText) findViewById(R.id.edtNoTelpon);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJurusan = edtJurusan.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strNoTelpon = edtNoTelpon.getText().toString();
                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strAlamat + "\n" + strJurusan + "\n" + strNoTelpon);
            }
        });
    }
}