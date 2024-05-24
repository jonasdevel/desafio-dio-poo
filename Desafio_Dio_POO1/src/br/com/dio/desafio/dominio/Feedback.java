package br.com.dio.desafio.dominio;

public class Feedback {

	  private String descricao;
	    private Dev dev;

	    public Feedback(String descricao, Dev dev, Conteudo conteudo) {
	        this.descricao = descricao;
	        this.dev = dev;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public Dev getDev() {
	        return dev;
	    }

	    public void setDev(Dev dev) {
	        this.dev = dev;
	    }

	    @Override
	    public String toString() {
	        return "Feedback{" +
	                "descricao='" + descricao + '\'' +
	                ", dev=" + dev.getNome() +
	                '}';
	    }
	}
	

