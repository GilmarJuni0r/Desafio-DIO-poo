import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.setNome("Maria");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.setNome("João");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
    }
}
