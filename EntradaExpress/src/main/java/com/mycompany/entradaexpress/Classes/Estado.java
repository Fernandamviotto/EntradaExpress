package com.mycompany.entradaexpress.Classes;

public class Estado {

    public int id;
    public String sigla;
    public String nome;
    
    public int getid(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
