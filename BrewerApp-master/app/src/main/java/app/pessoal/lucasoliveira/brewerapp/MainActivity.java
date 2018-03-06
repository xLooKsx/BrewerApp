package app.pessoal.lucasoliveira.brewerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgLogo;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarObjetos();

        imgLogo.setImageResource(R.drawable.ic_login);

        btnLogin.setOnClickListener(this);
//        btnLogin.setOnClickListener(cliqueLogin());
    }

//    protected View.OnClickListener cliqueLogin(){
//      return new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              imgLogo.setImageResource(R.drawable.ic_fuck_you);
//              Toast.makeText(MainActivity.this, "login efetuado", Toast.LENGTH_LONG).show();
//          }
//      };
//    }

    public void iniciarObjetos(){

        imgLogo = (ImageView)findViewById(R.id.imgLogo);
        btnLogin = (Button)findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View view) {

//        imgLogo.setImageResource(R.drawable.ic_fuck_you);
        Intent it = new Intent(MainActivity.this, TelaInicialActivity.class);
        startActivity(it);
    }
}
