package devandroid.moacir.applistacursovip6.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.moacir.applistacursovip6.model.Pessoa;
import devandroid.moacir.applistacursovip6.view.MainActivity;

public class PessoaController {

    public static final String NOME_PREFERENCES = "pref_listavip";
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public PessoaController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.i("MVC_Controller", "Salvo" + pessoa.toString());

        listaVip.putString("PrimeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("SobreNome", pessoa.getSobreNome());
        listaVip.putString("NomeCurso", pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato());
        listaVip.apply();

    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("PrimeiroNome", "n/a"));
        pessoa.setSobreNome(preferences.getString("SobreNome", "n/a"));
        pessoa.setCursoDesejado(preferences.getString("NomeCurso", "n/a"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "n/a"));
        return pessoa;
    }

    public void limpar() {

        listaVip.clear();
        listaVip.apply();
    }


}
