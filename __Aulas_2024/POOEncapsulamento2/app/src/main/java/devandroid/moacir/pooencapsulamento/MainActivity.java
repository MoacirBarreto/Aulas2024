package devandroid.moacir.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView txtTituloLivro;
    TextView txtAutor;
    TextView txtEditora;
    TextView txtPaginas;
    TextView txtLocalizacao;


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

        iniciarComponentesLayuot();
        criarObjetos();
    }

    private void iniciarComponentesLayuot() {
        txtAutor = findViewById(R.id.txtAutor);
        txtEditora = findViewById(R.id.txtEditora);
        txtLocalizacao = findViewById(R.id.txtLocalizacao);
        txtPaginas = findViewById(R.id.txtPaginas);
        txtTituloLivro = findViewById(R.id.txtTituloLivro);
    }

    public void criarObjetos(){
        Livro objLivro = new Livro();
        objLivro.setAutor("Moacir Barreto");
        objLivro.setTitulo("POO para dundie");
        objLivro.setEditora("Mundial");
        objLivro.setPaginas(100);
        objLivro.setLocalizacao("L1L1");

        Log.i("POO-a", "Objeto Livro: Autor"+ objLivro.getAutor());
        Log.i("POO-a", "Objeto Livro: Título "+ objLivro.getTitulo());
        Log.i("POO-a", "Objeto Livro: Editora"+ objLivro.getEditora());
        Log.i("POO-a", "Objeto Livro: Páginas"+ objLivro.getPaginas());
        Log.i("POO-a", "Objeto Livro: Localização"+ objLivro.getLocalizacao());

        txtAutor.setText(objLivro.getAutor());
        txtTituloLivro.setText(objLivro.getTitulo());
        txtPaginas.setText(objLivro.getPaginas()+"");
        txtLocalizacao.setText(objLivro.getLocalizacao());
        txtEditora.setText(objLivro.getEditora());


    }
}