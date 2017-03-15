package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by CECyT9 on 15/03/2017.
 */

public class Login extends Activity {
    EditText txtUsuario, txtContra;
    TextView lblMsj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        txtUsuario=(EditText) findViewById(R.id.name);
        txtContra = (EditText) findViewById(R.id.psw);
        lblMsj = (TextView) findViewById(R.id.MSJ);
    }

    public void entrar(View laVistaXML){

        String usr = "Yaxiri";
        if(txtUsuario.getText().toString().equals("Yaxiri") && txtContra.getText().toString().equals("yoxi") ){

            Intent miIntento = new Intent(this, MainActivity.class);
            miIntento.putExtra("nombreusr", usr);
            startActivity(miIntento);
        } else{
            String msj = "Usuario inválido";
            lblMsj.setText(msj);
        }
    }
}
