import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java developer");
        bootcamp.getConteodos().add(curso1);
        bootcamp.getConteodos().add(curso2);
        bootcamp.getConteodos().add(mentoria1);


        Dev devDayvson = new Dev();
        devDayvson.setNome("Dayvson");
        devDayvson.inscreverBootcamp(bootcamp);
        System.out.println("-----------------------------inicio------------------------------------------");
        System.out.println("Conteodo inscritos Dayvson: " + devDayvson.getConteodosInscritos());
        devDayvson.proguedir();
        devDayvson.proguedir();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Conteodo concluidos Dayvson: " + devDayvson.getConteodosConcluidos());
        System.out.println("Conteodo inscritos Dayvson: " + devDayvson.getConteodosInscritos());
        System.out.println("Xp: " + devDayvson.calcularTotalXp());
        System.out.println("-----------------------------final------------------------------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("-----------------------------inicio------------------------------------------");
        System.out.println("Conteodo inscritos Camila: " + devCamila.getConteodosInscritos());
        devCamila.proguedir();
        devCamila.proguedir();
        devCamila.proguedir();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Conteodo concluidos Camila: " + devCamila.getConteodosConcluidos());
        System.out.println("Conteodo inscritos Camila: " + devCamila.getConteodosInscritos());
        System.out.println("Xp: " + devCamila.calcularTotalXp());
        System.out.println("-----------------------------final------------------------------------------");


    }
}