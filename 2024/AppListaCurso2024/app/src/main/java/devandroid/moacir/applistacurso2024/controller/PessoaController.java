package devandroid.moacir.applistacurso2024.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.moacir.applistacurso2024.model.Pessoa;

public class PessoaController {
    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller","Controller iniciada..");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller","Salvo: "+pessoa.toString());
    }
}
