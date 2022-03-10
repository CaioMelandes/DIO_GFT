import com.dio.dominio.Bootcamp;
import com.dio.dominio.Curso;
import com.dio.dominio.Dev;
import com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso de introdução a linguagem Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso Javascript");
        cursoJS.setDescricao("Curso de introdução a linguagem Javascript");
        cursoJS.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Descrição mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampGFT = new Bootcamp();
        bootcampGFT.setNome("Bootcamp GFT");
        bootcampGFT.setDescricao("Descrição");
        bootcampGFT.getConteudos().add(cursoJava);
        bootcampGFT.getConteudos().add(cursoJS);
        bootcampGFT.getConteudos().add(mentoriaJava);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcampGFT);
        System.out.println("Conteúdos Inscritos Caio: " +devCaio.getConteudosInscritos());

        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio: " +devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Caio: " +devCaio.getConteudosConcluidos());
        System.out.println("XP: " +devCaio.calcularTotalXp());

        System.out.println("---------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcampGFT);
        System.out.println("Conteúdos Inscritos Ana: " +devCaio.getConteudosInscritos());

        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana: " +devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana: " +devCaio.getConteudosConcluidos());
        System.out.println("XP: " +devAna.calcularTotalXp());
    }
}
