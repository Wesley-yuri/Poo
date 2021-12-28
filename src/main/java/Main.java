import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        System.out.println("==========================================");


        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();

      /*  mentoria1.setTitulo("Mnetoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());
*/

       // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Wesley" + devWesley.getConteudoInscritos());

        devWesley.progredir();
        devWesley.progredir();
        devWesley.progredir();

        System.out.println("-");
        System.out.println("Conteudos inscritos Wesley" + devWesley.getConteudoInscritos());
        System.out.println("Conteudos concluidos wesley " + devWesley.getConteudosConcluidos());
        System.out.println("XP:" + devWesley.calcularTotalXp());






        System.out.println("==========================================");










        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João" + devJoao.getConteudoInscritos());

        devJoao.progredir();

        System.out.println("-");

        System.out.println("Conteudos inscritos João" + devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos João " + devWesley.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
