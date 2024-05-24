package br.com.dio.desafio.dominio;

public class Recompensa {

	 private String nome;
	    private String descricao;
	    private double xpNecessario;

	    public Recompensa(String nome, String descricao, double xpNecessario) {
	        this.nome = nome;
	        this.descricao = descricao;
	        this.xpNecessario = xpNecessario;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public double getXpNecessario() {
	        return xpNecessario;
	    }

	    public void setXpNecessario(double xpNecessario) {
	        this.xpNecessario = xpNecessario;
	    }

	    @Override
	    public String toString() {
	        return "Recompensa{" +
	                "nome='" + nome + '\'' +
	                ", descricao='" + descricao + '\'' +
	                ", xpNecessario=" + xpNecessario +
	                '}';
	    }
	}
	

