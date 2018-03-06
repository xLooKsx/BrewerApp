package app.pessoal.lucasoliveira.brewerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Toast.makeText(TelaInicialActivity.this, "login efetuado", Toast.LENGTH_LONG).show();
    }
}
