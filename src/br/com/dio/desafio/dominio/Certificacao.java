package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Certificacao {
    private String titulo;
    private String nomeDeveloper;
    private String data;
    private String codigo;
    private List<String> certificados = new ArrayList<>();

    public void geradorCertificado(String titulo, String nomeDeveloper, String data, String codigo){
        this.titulo = titulo;
        this.nomeDeveloper = nomeDeveloper;
        this.data = data;
        this.codigo = codigo;
        certificados.add(titulo + " - " + codigo);
    }

    public void exibirCertificados(){
        System.out.println(certificados);
    }

    public void removerCertificado(String codigo){
        String codigoRemover = null;
        if(!certificados.isEmpty()){
            for (String c: certificados){
                if(c.equalsIgnoreCase(codigo)){
                    codigoRemover = c;
                    break;
                }
            }
            certificados.remove(codigoRemover);
        }else {
            throw new RuntimeException("Lista sem certificados!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDeveloper() {
        return nomeDeveloper;
    }

    public void setNomeDeveloper(String nomeDeveloper) {
        this.nomeDeveloper = nomeDeveloper;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
