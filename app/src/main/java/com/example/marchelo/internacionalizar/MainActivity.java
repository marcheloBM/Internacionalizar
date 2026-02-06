package com.example.marchelo.internacionalizar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Verificar actualización al iniciar
        UpdateChecker.checkForUpdate(this);

        // Recupera un String desde el código
        String idiomaPorDefecto = getString(R.string.idiomaPorDefecto);
        mostrarIdioma(idiomaPorDefecto);
    }

    private void mostrarIdioma(String s){
        TextView tvIdioma = (TextView) findViewById(R.id.tvIdioma);
        tvIdioma.setText(s);
    }

    public void actualizarInfo(View v) {
        Locale locale = Locale.getDefault();
        // Muestra el Lenguaje y País por defecto
        mostrarIdioma(locale.getLanguage() + "-" + locale.getCountry());
    }
}
