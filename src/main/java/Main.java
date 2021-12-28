import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Descrição Curso Java");
    curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();

    curso2.setTitulo("Curso Js");
    curso2.setDescricao("Descrição curso JavaScript");
    curso2.setCargaHoraria(4);

        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mnetoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());


        System.out.println(mentoria1);


    }
}
