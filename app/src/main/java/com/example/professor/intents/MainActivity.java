package com.example.professor.intents;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCadastro(View view){
        //Intent Explícita
        //Intent intent = new Intent(this, CadastroActivity.class);
        //startActivity(intent);

        //Intent Implícita
        Intent intent = new Intent("com.example.professor.intent.CADASTRO");
        startActivity(intent);
    }

    public void openConfig(View view){
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }

    public void openBrowser(View view){
        Uri uri = Uri.parse("http://www.android.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
