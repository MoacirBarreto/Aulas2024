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

     Pessoa pessoa;
     Pessoa outraPessoa;

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
        pessoa = new Pessoa();  //cria objeto
        //atribuir conteudo para objeto
        pessoa.setPrimeiroNome("Moacir");
        pessoa.setSobreNome("Barreto");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("84-9-94512016");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiza");
        outraPessoa.setSobreNome("Araujo");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("85-9-999999999");

        int parada = 0;



    }
}