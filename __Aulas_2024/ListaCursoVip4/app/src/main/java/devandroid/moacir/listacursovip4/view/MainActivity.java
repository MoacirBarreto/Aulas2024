package devandroid.moacir.listacursovip4.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.moacir.listacursovip4.R;
import devandroid.moacir.listacursovip4.controller.PessoaController;
import devandroid.moacir.listacursovip4.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    //declaração das classes

    Pessoa pessoa;
    PessoaController controller;

    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

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

       controller = new PessoaController();
       controller.toString();

       pessoa = new Pessoa();
       pessoa.setPrimeiroNome("Joao");


       }
}