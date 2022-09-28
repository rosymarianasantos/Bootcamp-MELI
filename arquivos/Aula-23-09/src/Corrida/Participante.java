package Corrida;

public class Participante {
    int rg;
    String nome;
    String sobrenome;
   String telefone;
    String emergencia;
    String grupoSanguineo;
    int categoria;
    int idade;

    public Participante(int rg, String nome, String sobrenome, String telefone, String emergencia, String grupoSanguineo, int categoria, int idade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.emergencia = emergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.categoria = categoria;
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
