package com.example.professor.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//Activity que imprime logs nos métodos de ciclo de vida
public class MainActivity extends AppCompatActivity {

    protected static final String TAG = "LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Método onCreate() chamado: " + savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Método onStart() chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Método onResume() chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Método onPause() chamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Método onStop() chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Método onRestart() chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Método onDestroy() chamado.");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "Método onSaveInstanceState() chamado: " + outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //O sistema chama depois do método onStart().
        // O sistema chama onRestoreInstanceState() se houver um estado salvo a restaurar.
        // Portanto, não é necessário verificar se Bundle é nulo
    }
}
