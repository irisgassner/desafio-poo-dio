package br.com.dio.desafio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {    
        return "Curso{" +
                "titulo='" + titulo + "\'" +
                ", descricao='" + descricao + "\'" +
                ", carga horaria='" + cargaHoraria + "\'"+
                "}";
    }
}