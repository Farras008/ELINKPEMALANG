package tk.cagarbudayapml.e_linkpemalang.activity.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import tk.cagarbudayapml.e_linkpemalang.R;
import tk.cagarbudayapml.e_linkpemalang.activity.main.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        ImageView pml = (ImageView) findViewById(R.id.pemalang);
//        Glide.with(this)
//                .load(R.drawable.pemalang)
//                .into(pml);
//        ImageView sma = (ImageView) findViewById(R.id.smansa);
//        Glide.with(this)
//                .load(R.drawable.smansa)
//                .into(sma);
//        ImageView cgr = (ImageView) findViewById(R.id.cagar);
//        Glide.with(this)
//                .load(R.drawable.nav_drawer_cagar)
//                .into(cgr);
        Handler SplashHandler = new Handler();
        SplashHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        },3000);
    }
}
