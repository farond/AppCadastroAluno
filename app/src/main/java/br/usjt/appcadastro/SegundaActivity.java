/**
 * App_cadastro Aluno
 *
 * USJT 2020/02
 *
 * Fabio Lino 818231407
 * Rodrigo Lopes 818229763
 *
 */

package br.usjt.appcadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
            String nome = intent.getStringExtra(("NOME"));
            String ra = intent.getStringExtra(("RA"));
            String idade = intent.getStringExtra(("IDADE"));
            String semestre = intent.getStringExtra(("SEMESTRE"));
            String curso = intent.getStringExtra(("CURSO"));

            //TextView
        TextView textoSegundaTela =  findViewById(R.id.textoSegundaTelaTV);

        //setText

        textoSegundaTela.setText("Olá, "+nome+" sua idade é "+idade+" anos. Seu RA: "+ra+" você esta cursando "+curso+" e o seu semestre é "+semestre+"º");

    }


    public void voltar(View view) {
        finish();
    }
}