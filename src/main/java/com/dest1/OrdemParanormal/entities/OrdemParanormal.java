package com.dest1.OrdemParanormal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrdemParanormal {
    @Id
    private int id;
    private String nome;
    private int idade;
    private String funcao;
    private String descricao;
    private int agilidade;
    private int forca;
    private int intelecto;
    private int presenca;
    private int vigor;

    public OrdemParanormal(){}

    public OrdemParanormal(String nome, int idade, String funcao, String descricao, int agilidade, int forca, int intelecto, int presenca, int vigor) {
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.descricao = descricao;
        this.agilidade = agilidade;
        this.forca = forca;
        this.intelecto = intelecto;
        this.presenca = presenca;
        this.vigor = vigor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }
}
