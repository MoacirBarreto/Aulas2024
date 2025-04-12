package devandroid.moacir.appgaseta.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;

import java.util.List;

import devandroid.moacir.appgaseta.database.GasEtaDB;
import devandroid.moacir.appgaseta.view.GasEtaActivity;

public class CombustivelController extends GasEtaDB {

    public static final String NOME_PREFERENCES = "pref_gaseta";
    SharedPreferences preferences;
    SharedPreferences.Editor dadosPreferences;

    public CombustivelController(GasEtaActivity activity) {
        super(activity);
        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);
        dadosPreferences = preferences.edit();
    }

    public void salvar(Combustivel combustivel) {
        ContentValues dados = new ContentValues();

        dadosPreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("precoDoCombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao", combustivel.getRecomendacao());
        dadosPreferences.apply();

        dados.put("nomeDoCombustivel", combustivel.getNomeDoCombustivel());
        dados.put("precoDoCombustivel", combustivel.getPrecoDoCombustivel());
        dados.put("recomendacao", combustivel.getRecomendacao());

        salvarObjeto("combustivel", dados);
    }

    public List<Combustivel> getListaDeDados() {
        return listarDados;
    }

    public void limpar() {
        dadosPreferences.clear();
        dadosPreferences.apply();
    }
}
