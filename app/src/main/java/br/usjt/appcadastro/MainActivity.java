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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText
        final EditText nomeAluno = findViewById(R.id.nomeEditText);
        final EditText raAluno = findViewById(R.id.raEditText);
        final EditText idadeAluno = findViewById(R.id.idadeEditText);
        final EditText semestreAluno = findViewById(R.id.semestreEditText);
        final EditText cursoAluno = findViewById(R.id.cursoEditText);

        //button
        Button enviarButton = findViewById((R.id.enviarButton));

        //clicar no botão

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //consumir dado
                String nome = nomeAluno.getText().toString();
                String ra = raAluno.getText().toString();
                String idade = idadeAluno.getText().toString();
                String semestre = semestreAluno.getText().toString();
                String curso = cursoAluno.getText().toString();

                //activity intent
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("NOME", nome);
                intent.putExtra("RA", ra);
                intent.putExtra("IDADE", idade);
                intent.putExtra("SEMESTRE", semestre);
                intent.putExtra("CURSO", curso);
                startActivity(intent);
            }
        });
    }

}