package devandroid.moacir.applistacurso3.controller;

import android.util.Log;

import devandroid.moacir.applistacurso3.model.Pessoa;

public class PessoaController {
    public void salvar(Pessoa pessoa) {
        Log.i("MVC_Controller", "Salvo: "+pessoa.toString());
    }
}
