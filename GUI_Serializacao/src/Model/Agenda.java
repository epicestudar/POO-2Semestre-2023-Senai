package Model;

import java.io.Serializable;

public class Agenda implements Serializable{
    // atributos
    private String usuario;
    private String data;
    private String hora;
    private String descricao;

    
    public Agenda(String usuario, String data, String hora, String descricao) {
        this.usuario = usuario;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}
