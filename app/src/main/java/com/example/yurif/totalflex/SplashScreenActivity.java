package com.example.yurif.totalflex;
/**
 * Created by Yuri e Priscilla on 06/11/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.yurif.totalflex.MainActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Esta classe representa a activity SplashScreen, que será exibida na inicialização do aplicativo.
 */
public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Cria um TimerTask para exibir o splash por alguns segundos e depois chamar a tela do MainActivity.java
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {

                // Cria uma intent explicita para abrir a activity MainActiivty e encerra a activity atual
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
            // Cria o tempo em milisegundos da Splash
        }, 4000);

    }
}
