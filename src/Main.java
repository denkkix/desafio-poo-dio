import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Professor;
import br.com.dio.desafio.dominio.Projetos;
import br.com.dio.desafio.dominio.Certificacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("_________");
        Certificacao certificadoJava = new Certificacao();
        certificadoJava.geradorCertificado("OPP Java", devCamila.getNome(), "2013-02-05", "GHJSBN");
        certificadoJava.exibirCertificados();

        System.out.println("__________");
        Professor Diego = new Professor("Diego Paulista", "Desenvolvedor Senior");
        Diego.adicionarCurso(curso1);
        Diego.adicionarCurso(curso2);
        Diego.exibirCursos();
        Diego.removerCurso(curso2);
        Diego.exibirCursos();

        System.out.println("__________");
        Diego.adicionarMentoria(mentoria);
        Diego.exibirMentorias();

        System.out.println("__________");
        Projetos pooProjeto = new Projetos();
        pooProjeto.adicionarProj("Poo Java", "Aprendendo sobre POO");
        pooProjeto.adicionarTec("Java");
        pooProjeto.adicionarMembros(devCamila);
        pooProjeto.adicionarTec("SpringBoot");
        pooProjeto.adicionarMembros(devCamila);
        pooProjeto.adicionarMembros(devCamila);
        pooProjeto.adicionarMembros(devCamila);
        pooProjeto.adicionarMembros(devCamila);
        pooProjeto.adicionarMembros(devCamila);
        System.out.println("Quantidade de Membros:" + pooProjeto.obterNumeroMembros());
        pooProjeto.obterTecnologiasUsadas();
        pooProjeto.removerMembros(devCamila);
        System.out.println("Quantidade de Membro:" + pooProjeto.obterNumeroMembros());


    }

}
