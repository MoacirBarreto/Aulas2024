package devandroid.moacir.applistacurso3.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.moacir.applistacurso3.R;
import devandroid.moacir.applistacurso3.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    //decalaração de classes
    Pessoa pessoa;
    Pessoa outraPessoa;
    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    // strings
    String dadosPessoa;
    String dadosOutraPessoa;

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
    pessoa = new Pessoa();
    pessoa.setPrimeiroNome("Moacir");
    pessoa.setSobreNome("Barreto");
    pessoa.setCursoDesejado("Android");
    pessoa.setTelefoneContato("9999999");

    dadosPessoa = "Primeiro nome: ";
    dadosPessoa += pessoa.getPrimeiroNome();
    dadosPessoa += " Sobrenome: ";
    dadosPessoa += pessoa.getSobreNome();
    dadosPessoa += " Curso desejado: ";
    dadosPessoa += pessoa.getCursoDesejado();
    dadosPessoa += " Telefone Contato: ";
    dadosPessoa += pessoa.getTelefoneContato();

    outraPessoa = new Pessoa();
    outraPessoa.setPrimeiroNome("Moacir");
    outraPessoa.setSobreNome("Barreto");
    outraPessoa.setCursoDesejado("Android");
    outraPessoa.setTelefoneContato("9999999");

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


 /*   dadosOutraPessoa = "Primeiro nome: ";
    dadosOutraPessoa += outraPessoa.getPrimeiroNome();
    dadosOutraPessoa += " Sobrenome: ";
    dadosOutraPessoa += outraPessoa.getSobreNome();
    dadosOutraPessoa += " Curso desejado: ";
    dadosOutraPessoa += outraPessoa.getCursoDesejado();
    dadosOutraPessoa += " Telefone Contato: ";
    dadosOutraPessoa += outraPessoa.getTelefoneContato();

    Log.i("Pooandroid",pessoa.toString());
    Log.i("Pooandroid",outraPessoa.toString());
*/
    }
}