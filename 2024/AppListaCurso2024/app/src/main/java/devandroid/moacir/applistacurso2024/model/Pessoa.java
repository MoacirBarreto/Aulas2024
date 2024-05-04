package devandroid.moacir.applistacurso2024.model;

// construtor da classe   / template


public class Pessoa {
    // Atributos - obj Template
    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String contato;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    // Metodos de Acesso Gets and Sets
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Pessoa(){

    }

}
