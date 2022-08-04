package com.hamlemuhendislik.proje3_2ekranluygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText metinAlani;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = "";
        metinAlani = findViewById(R.id.editTextTextPersonName);
    }



    public void changeActivity(View view){
        username = metinAlani.getText().toString();
        Intent intent = new Intent(MainActivity.this , MainActivity2.class);

        intent.putExtra("userInput" , username);
        startActivity(intent);
    }

}