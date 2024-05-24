package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	
	 private int cargaHoraria;

	    @Override
	    public double calcularXp() {
	        return XP_PADRAO * cargaHoraria;
	    }

	    public int getCargaHoraria() {
	        return cargaHoraria;
	    }

	    public void setCargaHoraria(int cargaHoraria) {
	        this.cargaHoraria = cargaHoraria;
	    }

	    @Override
	    public String toString() {
	        return "Curso{" +
	                "titulo='" + getTitulo() + '\'' +
	                ", descricao='" + getDescricao() + '\'' +
	                ", cargaHoraria=" + cargaHoraria +
	                '}';
	    }

		@Override
		public double calcularXP() {
			
			return 0;
		}

		@Override
		protected double getXpNecessario() {
			
			return 0;
		}

		@Override
		protected String getNome() {
			
			return null;
		}

		@Override
		protected double getXpNecessario1() {
			
			return 0;
		}
	}