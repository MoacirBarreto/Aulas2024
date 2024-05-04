 package devandroid.moacir.applistacurso2024.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.moacir.applistacurso2024.R;
import devandroid.moacir.applistacurso2024.model.Pessoa;

 public class MainActivity extends AppCompatActivity {

     Pessoa pessoa;  //declarei objeto
     Pessoa outraPessoa;
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
        // instanciar objeto
        pessoa = new Pessoa();
        // Atribuir conteudo para obj conforme template (model)
        pessoa.setPrimeiroNome("Moacir");
        pessoa.setSobreNome("Barreto");
        pessoa.setCursoDesejado("Android");
        pessoa.setContato("84-9-999999999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("java");
        outraPessoa.setContato("85-99999999");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Contato: ";
        dadosPessoa += pessoa.getContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Contato: ";
        dadosOutraPessoa += outraPessoa.getContato();



        int parada = 0;


    }
}