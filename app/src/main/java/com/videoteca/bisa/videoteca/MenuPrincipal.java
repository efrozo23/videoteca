package com.videoteca.bisa.videoteca;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.videoteca.bisa.utils.Constantes;

import pl.droidsonroids.gif.GifImageView;


public class MenuPrincipal extends AppCompatActivity {

    private Toolbar toolbar;
    private Menu menu;
    private GifImageView gifImageVideo;
    private GifImageView gifVideoC;
    private GifImageView gifAudioV;
    private GifImageView gifFotografia;
    private GifImageView gifPublicacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        setSupportActionBar(toolbar);
        toolbar.setTitle("VIDEOTECA");
        toolbar.inflateMenu(R.menu.menu_main);
        gifImageVideo = (GifImageView) findViewById(R.id.video);

        gifImageVideo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                goContent(Constantes.VIDEO);

            }
        });

        gifVideoC = (GifImageView) findViewById(R.id.videoc) ;
        gifVideoC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goContent(Constantes.VIDEOCONFERENCIA);
            }
        });
        gifAudioV = (GifImageView) findViewById(R.id.audiovirtuales) ;
        gifAudioV.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goContent(Constantes.AUDIENCIASVIRTUALES);
            }
        });
        gifFotografia = (GifImageView) findViewById(R.id.foto) ;
        gifFotografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goContent(Constantes.FOTOGRAFIAS);
            }
        });
        gifPublicacion = (GifImageView) findViewById(R.id.publicaciones) ;
        gifPublicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goContent(Constantes.PUBLICACIONES);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu item) {
        // Inflate the menu, this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, item);

        return true;
    }


    public void goContent(String value){


        Intent intent =new Intent(this, Content.class);

        intent.putExtra("idsearch",""+value);
        startActivity(intent);
    }
}
