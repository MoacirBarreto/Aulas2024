package devandroid.moacir.applistacursovip6.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.moacir.applistacursovip6.model.Curso;

public class CursoController {

    private List listaCursos;

    public List getListaDeCursos() {
        listaCursos = new ArrayList<Curso>();
        listaCursos.add(new Curso("Java"));
        listaCursos.add(new Curso("HTML"));
        listaCursos.add(new Curso("C#"));
        listaCursos.add(new Curso("Python"));
        listaCursos.add(new Curso("PHP"));
        listaCursos.add(new Curso("JAVA EE"));
        listaCursos.add(new Curso("Flutter"));
        listaCursos.add(new Curso("Dart"));

        return listaCursos;
    }

    public ArrayList<String> dadosParaSpinner() {

        // instanciando
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {
            Curso objeto = (Curso) getListaDeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
        }
        return dados;
    }
}
