package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main  {

public static void main(String[] args) {
        
	

	        Curso curso1 = new Curso();
	        curso1.setTitulo("Curso Java");
	        curso1.setDescricao("Descrição Curso Java");
	        curso1.setCargaHoraria(30);

	        Curso curso2 = new Curso();
	        curso2.setTitulo("Curso de JavaScript");
	        curso2.setDescricao("Descrição Curso JavaScript");
	        curso2.setCargaHoraria(20);

	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitulo("Mentoria de Java");
	        mentoria.setDescricao("Descrição Mentoria Java");
	        mentoria.setData(LocalDate.now());

	        Bootcamp bootcamp = new Bootcamp();
	        bootcamp.setNome("Bootcamp Java Developer");
	        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	        bootcamp.getConteudos().add(curso1);
	        bootcamp.getConteudos().add(curso2);
	        bootcamp.getConteudos().add(mentoria);

	        Dev devJonas = new Dev();
	        devJonas.setNome("Jonas Roque");
	        devJonas.inscreverBootcamp(bootcamp);

	        System.out.println("Conteúdos Inscritos Jonas:" + devJonas.getConteudosInscritos());

	        devJonas.progredir();
	        devJonas.progredir();

	        System.out.println("---------");

	        System.out.println("Conteúdos Inscritos Jonas:" + devJonas.getConteudosInscritos());
	        System.out.println("Conteúdos Concluidos Jonas:" + devJonas.getConteudosConcluidos());
	        System.out.println("XP:" + devJonas.calcularTotalXp());

	        System.out.println("---------");

	        Dev devPaulo = new Dev();
	        devPaulo.setNome("Paulo Silva");
	        devPaulo.inscreverBootcamp(bootcamp);

	        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosInscritos());

	        devPaulo.progredir();
	        devPaulo.progredir();

	        System.out.println("---------");

	        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosInscritos());
	        System.out.println("Conteúdos Concluidos Paulo:" + devPaulo.getConteudosConcluidos());
	        System.out.println("XP:" + devPaulo.calcularTotalXp());

	        System.out.println("---------");

	        Recompensa recompensa = new Recompensa("Certificado de Conclusão", "Certificado para quem concluir o bootcamp", 50);
	        devJonas.receberRecompensa(recompensa);
	        devPaulo.receberRecompensa(recompensa);

	        devJonas.darFeedback(curso1, "Ótimo curso de Java!");
	        devPaulo.darFeedback(curso2, "Curso de JavaScript muito bom!");

	        System.out.println("Feedbacks Jonas: " + devJonas.getFeedbacks());
	        System.out.println("Feedbacks Paulo: " + devPaulo.getFeedbacks());
	    }
	}

