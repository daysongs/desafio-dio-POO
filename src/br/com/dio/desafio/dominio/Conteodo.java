package br.com.dio.desafio.dominio;

public abstract class Conteodo {

    protected static final double XP_PADRAO = 10d;

    //definindo os atribustos
    private String titulo;
    private String descricao;

    //Criando os metodos
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
