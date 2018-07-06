package tk.cagarbudayapml.e_linkpemalang.activity.detailcagar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import tk.cagarbudayapml.e_linkpemalang.R;

public class DetailCagarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cagar);
        ImageView iv_detail_cagar = findViewById(R.id.iv_detail_cagar);
        TextView tv_detail_cagar = findViewById(R.id.tv_detailcagar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Integer datafotoCagar = getIntent().getIntExtra("DATA_FOTO",0);
        String datajudulCagar = getIntent().getStringExtra("DATA_JUDUL");
        String dataDeskripsi = getIntent().getStringExtra("DATA_DESKRIPSI");

        Glide.with(this).load(datafotoCagar).crossFade().into(iv_detail_cagar);
        tv_detail_cagar.setText(dataDeskripsi);
        getSupportActionBar().setTitle(datajudulCagar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
}
