package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

	public class Dev {
	
	  private String nome;
	    private String email;
	    private String telefone;
	    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	    private Set<Bootcamp> historicoBootcamps = new LinkedHashSet<>();
	    private Set<Feedback> feedbacks = new LinkedHashSet<>();
	    private Set<Recompensa> recompensas = new LinkedHashSet<>();

	    public void inscreverBootcamp(Bootcamp bootcamp) {
	        this.conteudosInscritos.addAll(bootcamp.getConteudos());
	        bootcamp.getDevsInscritos().add(this);
	        historicoBootcamps.add(bootcamp);
	    }

	    public void progredir() {
	        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
	        if (conteudo.isPresent()) {
	            Conteudo c = conteudo.get();
	            if (c != null) {
	                this.conteudosConcluidos.add(c);
	                this.conteudosInscritos.remove(c);
	            }
	        } else {
	            System.err.println("Você não está matriculado em nenhum conteúdo!");
	        }
	    }

	    public void darFeedback(Conteudo conteudo, String descricao) {
	        Feedback feedback = new Feedback(descricao, this, conteudo);
	        this.feedbacks.add(feedback);
	    }

	    public double calcularTotalXp() {
	        return this.conteudosConcluidos.stream()
	                .filter(Objects::nonNull)
	                .mapToDouble(Conteudo::calcularXp)
	                .sum();
	    }

	    public void receberRecompensa(Recompensa recompensa) {
	        if (this.calcularTotalXp() >= recompensa.getXpNecessario()) {
	            this.recompensas.add(recompensa);
	            System.out.println(this.nome + " recebeu a recompensa: " + recompensa.getNome());
	        } else {
	            System.out.println(this.nome + " não tem XP suficiente para a recompensa: " + recompensa.getNome());
	        }
	    }

	    public Set<Bootcamp> getHistoricoBootcamps() {
	        return historicoBootcamps;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public Set<Conteudo> getConteudosInscritos() {
	        return conteudosInscritos;
	    }

	    public Set<Conteudo> getConteudosConcluidos() {
	        return conteudosConcluidos;
	    }

	    public Set<Feedback> getFeedbacks() {
	        return feedbacks;
	    }

	    public Set<Recompensa> getRecompensas() {
	        return recompensas;
	    }
	}
