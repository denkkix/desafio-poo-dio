package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nome;
    private String stack;
    private Set<Curso> cursoPalestrados = new LinkedHashSet<>();
    private Set<Mentoria> mentoriasPalestradas = new LinkedHashSet<>();

    public Professor(String nome, String stack){
        this.nome = nome;
        this.stack = stack;
        this.cursoPalestrados = new LinkedHashSet<>();
        this.mentoriasPalestradas = new LinkedHashSet<>();
    }

    public void adicionarCurso(Curso curso){
        cursoPalestrados.add(curso);
    }
    public void removerCurso(Curso curso){
        cursoPalestrados.remove(curso);
    }
    public void adicionarMentoria(Mentoria mentoria){
        mentoriasPalestradas.add(mentoria);
    }
    public void removerMentoria(Mentoria mentoria){
        mentoriasPalestradas.remove(mentoria);
    }
    public void exibirCursos(){
        System.out.println(cursoPalestrados);
    }
    public void exibirMentorias(){
        System.out.println(mentoriasPalestradas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Set<Curso> getCursoPalestrados() {
        return cursoPalestrados;
    }

    public void setCursoPalestrados(Set<Curso> cursoPalestrados) {
        this.cursoPalestrados = cursoPalestrados;
    }

    public void setMentoriasPalestradas(Set<Mentoria> mentoriasPalestradas){
        this.mentoriasPalestradas = mentoriasPalestradas;
    }
}
