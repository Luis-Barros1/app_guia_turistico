package com.example.guiacidadedesorocaba.model;

public class Local {

    private String local, saibaMais;
    private int imagem;
    private String nomeLocal;

    public Local() {
    }

    public Local(String local, String saibaMais, int imagem, String nomeLocal) {
        this.local = local;
        this.saibaMais = saibaMais;
        this.imagem = imagem;
        this.nomeLocal = nomeLocal;
    }

    public String getLocal() {
        return local;
    }

    public String getSaibaMais() {
        return saibaMais;
    }

    public int getImagem() {
        return imagem;
    }

    public String getNomeLocal() { return nomeLocal; }
}
