package com.appsmor.tutorialsatu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnexplicit,btnimplicit,btnclose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnexplicit = (Button)findViewById(R.id.bt1);
        btnimplicit = (Button)findViewById(R.id.bt2);
        btnclose = (Button)findViewById(R.id.bt3);

        btnexplicit.setOnClickListener(this);
        btnimplicit.setOnClickListener(this);
        btnclose.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                Intent explicit = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(explicit);
                break;
            case R.id.bt2:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.appsmor.konverhijrmash"));
                startActivity(implicit);
                break;
            case R.id.bt3:
                finish();
                break;

        }
    }
}
