package android.example.com.FANHARILARDIAN_1202150022_MODUL2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Fanharil Ardian on 18/02/2018.
 */

public class Home extends AppCompatActivity {
    private RadioGroup GRUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Memunculkan Toast FANHARILARDIAN_1202150022
        Toast.makeText(this, "FANHARILARDIAN_1202150022", Toast.LENGTH_LONG).show();
    }

    public void pesanNow(View view) {
        // memasukan isi dari tombol radio yang telah terpilih ke dalam variabel GRUP dari id radioButton
        GRUP = (RadioGroup) findViewById(R.id.radioGroup);
        // bila radio button terpilih pada radio untuk dine in :
        if (GRUP.getCheckedRadioButtonId()== R.id.rbDineIn){
            Toast.makeText(this, "Dine In terpilih", Toast.LENGTH_SHORT).show();
            // pindah ke activity DineIn
            startActivity(new Intent(this, DineIn.class));

        }
        // bila terpilih selain dine in
        else {
            Toast.makeText(this, "Take Away terpilih", Toast.LENGTH_SHORT).show();
            // pindah ke activity Take Away
            startActivity(new Intent(this, TakeAway.class));
        }

    }


}
