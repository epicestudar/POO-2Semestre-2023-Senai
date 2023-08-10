package RevisaoFPOO.Cadastro;

public abstract class Animais {
    //Atributos
    String especie;
    String nome;
    double peso;
    String porte;
    String proprietario;

    // Métodos:
    // 1. Construtor
     public Animais(String especie, String nome, double peso, String porte, String proprietario) {
        this.especie = especie;
        this.nome = nome;
        this.peso = peso;
        this.porte = porte;
        this.proprietario = proprietario;
    }

    // 2. Construtor vazio --  ctor
    public Animais() {
        super();
    }

    // 3. gets and sets
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}