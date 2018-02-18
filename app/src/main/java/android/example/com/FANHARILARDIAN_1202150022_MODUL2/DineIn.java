package android.example.com.FANHARILARDIAN_1202150022_MODUL2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fanharil Ardian on 18/02/2018.
 */

public class DineIn extends AppCompatActivity {
    // membuat variabel inisiasi
    TextView tvNama;
    Button tombolPilihPesanan;
    Spinner SPINNER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
    }

    public void pilihPesanan(View view) {
        // masukan apa yang diinputkan pada field dengan id 'name' kedalam variabel tvNama
        tvNama =(TextView) findViewById(R.id.name);
        // masukan apa yang diinputkan tersebut kedalam variabel NAMA bertipe string
        String NAMA = tvNama.getText().toString();

        // masukan apa yang di klik pada tombol dengan id tombolPilihPesanan kedalam variabel tombolPilihPesanan
        tombolPilihPesanan = (Button) findViewById(R.id.tombolPilihPesanan);
        // masukan apa yang dipilih pada spinner dengan id pilihMejaSpinner
        SPINNER = (Spinner) findViewById(R.id.pilihMejaSpinner);
        // masukan yang dimasukan kedalam SPINNER kedalam variabel meja
        String mejaTerpilih = SPINNER.getSelectedItem().toString();

        // kalau yang terpilih masih Meja dan field nama masih kosong :
        if (mejaTerpilih.equals("Meja") && NAMA.isEmpty()) {
            // munculkan Toast
            Toast.makeText(DineIn.this, "Harap isi nama dan pilih meja", Toast.LENGTH_LONG).show();
        }
        // kalau yang terpilih masih Meja dan field nama sudah terisi (tidak kosong)
        else if (mejaTerpilih.equals("Meja") && NAMA != null){
            // munculkan Toast
            Toast.makeText(DineIn.this, "Pilih meja terlebih dahulu", Toast.LENGTH_LONG).show();
        }
        // kalau yang terpilih masih Meja dan field kosong
        else if (!mejaTerpilih.equals("Meja") && NAMA.isEmpty()){
            // munculkan Toast
            Toast.makeText(DineIn.this, "Isi nama terlebih dahulu", Toast.LENGTH_LONG).show();
        }
        // kalau yang terpilih sudah selain Meja dan field sudah diisi maka :
        else{
            // munculkan Toast
            Toast.makeText(DineIn.this, NAMA + " " + "telah memilih" + " " + mejaTerpilih, Toast.LENGTH_LONG).show();
            // pindah ke activity menu
            startActivity(new Intent(DineIn.this, MainMenu.class));
        }
    }
}
