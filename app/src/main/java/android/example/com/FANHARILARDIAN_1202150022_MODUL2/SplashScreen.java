package android.example.com.FANHARILARDIAN_1202150022_MODUL2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by Fanharil Ardian on 18/02/2018.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Memunculkan Splashscreen tapi tidak ada navigation bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread a = new Thread(){
            public void run(){
                try{ sleep(4000); }
                catch (InterruptedException e){ e.printStackTrace(); }
                finally {
                    // intent untuk pindah dari sini (splashscreen) ke kelas Home
                    startActivity(new Intent(SplashScreen.this, Home.class));
                    finish();
                }
            }
        };
        // jalankan thread
        a.start();

    }
}
