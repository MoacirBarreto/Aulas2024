package devandroid.moacir.applistacurso3.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.moacir.applistacurso3.R;
import devandroid.moacir.applistacurso3.controller.PessoaController;
import devandroid.moacir.applistacurso3.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    //declaração de classes
    SharedPreferences preferences;
    public static final String NOME_PRFERENCES = "pref_listaVip";


    Pessoa pessoa;
    PessoaController controller;

    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    // strings
    String dadosPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    preferences = getSharedPreferences(NOME_PRFERENCES, 0);
    SharedPreferences.Editor listaVip = preferences.edit();

    controller = new PessoaController();
    controller.toString();

    pessoa = new Pessoa();
    pessoa.setPrimeiroNome(preferences.getString("primeiroNome","n/a"));
    pessoa.setSobreNome(preferences.getString("sobreNome","n/a"));
    pessoa.setCursoDesejado(preferences.getString("nomeCurso","n/a"));
    pessoa.setTelefoneContato(preferences.getString("telefoneContato","n/a"));

    editPrimeiroNome.setText(pessoa.getPrimeiroNome());
    editSobreNomeAluno.setText(pessoa.getSobreNome());
    editNomeCurso.setText(pessoa.getCursoDesejado());
    editTelefoneContato.setText(pessoa.getTelefoneContato());
    
    dadosPessoa = "Primeiro nome: ";
    dadosPessoa += pessoa.getPrimeiroNome();
    dadosPessoa += " Sobrenome: ";
    dadosPessoa += pessoa.getSobreNome();
    dadosPessoa += " Curso desejado: ";
    dadosPessoa += pessoa.getCursoDesejado();
    dadosPessoa += " Telefone Contato: ";
    dadosPessoa += pessoa.getTelefoneContato();

    editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
    editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
    editNomeCurso = findViewById(R.id.editNomeCurso);
    editTelefoneContato = findViewById(R.id.editTelefoneContato);

    btnLimpar = findViewById(R.id.btnLimpar);
    btnSalvar = findViewById(R.id.btnSalvar);
    btnFinalizar = findViewById(R.id.btnFinalizar);

    editPrimeiroNome.setText(pessoa.getPrimeiroNome());
    editSobreNomeAluno.setText(pessoa.getSobreNome());
    editNomeCurso.setText(pessoa.getCursoDesejado());
    editTelefoneContato.setText(pessoa.getTelefoneContato());

    btnLimpar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editPrimeiroNome.setText("");
            editSobreNomeAluno.setText("");
            editTelefoneContato.setText("");
            editNomeCurso.setText("");
        }
    });
    btnFinalizar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"volte sempre", Toast.LENGTH_LONG).show();
            finish();
        }
    });
    btnSalvar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
            pessoa.setCursoDesejado(editNomeCurso.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
            Toast.makeText(MainActivity.this, "Salvo"+pessoa.toString(), Toast.LENGTH_LONG).show();

            listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
            listaVip.putString("sobreNome", pessoa.getSobreNome());
            listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
            listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
            listaVip.apply();

            controller.salvar(pessoa);

        }
    });
}}