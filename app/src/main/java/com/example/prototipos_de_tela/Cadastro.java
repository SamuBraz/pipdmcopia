package com.example.prototipos_de_tela;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro  extends Activity {

    String nome, sobrenome, email, senha, cpf, telefone;

    EditText te_Cadastro_Nome;
    EditText te_Cadastro_Sobrenome;
    EditText te_Cadastro_Email;
    EditText te_Cadastro_Senha;
    EditText te_Cadastro_CPF;
    EditText te_Cadastro_Telefone;
    Button btn_Cadastro_Cadastrar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        te_Cadastro_Nome = findViewById(R.id.te_Cadastro_Nome);
        te_Cadastro_Sobrenome = findViewById(R.id.te_Cadastro_Sobrenome);
        te_Cadastro_Email = findViewById(R.id.te_Cadastro_Email);
        te_Cadastro_Senha = findViewById(R.id.te_Cadastro_Senha);
        te_Cadastro_CPF = findViewById(R.id.te_Cadastro_CPF);
        te_Cadastro_Telefone = findViewById(R.id.te_Cadastro_Telefone);

        btn_Cadastro_Cadastrar = findViewById(R.id.btn_Cadastro_Cadastrar);
        btn_Cadastro_Cadastrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                nome = te_Cadastro_Nome.getText().toString();
                sobrenome = te_Cadastro_Sobrenome.getText().toString();
                email = te_Cadastro_Email.getText().toString();
                senha = te_Cadastro_Senha.getText().toString();
                cpf = te_Cadastro_CPF.getText().toString();
                telefone = te_Cadastro_Telefone.getText().toString();
                Log.d("Cadastro", "Nome: " + nome);
                Log.d("Cadastro", "Sobrenome: " + sobrenome);
                Log.d("Cadastro", "Email: " + email);
                Log.d("Cadastro", "CPF: " + cpf);
                Log.d("Cadastro", "Telefone: " + telefone);
            }
        });
    }
}

