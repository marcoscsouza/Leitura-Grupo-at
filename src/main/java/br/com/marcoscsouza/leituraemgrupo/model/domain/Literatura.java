package br.com.marcoscsouza.leituraemgrupo.model.domain;

public abstract class Literatura {

	private int anoPublicado;
	private String titulo;
	private float valor;
	
	public Literatura(int anoPublicado, String titulo, float valor) {
		this.anoPublicado = anoPublicado;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public abstract String calcularRaridade();

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(anoPublicado);
		sb.append(";");
		sb.append(titulo);
		sb.append(";");
		sb.append(valor);
		return sb.toString();
	}

	public int getAnoPublicado() {
		return anoPublicado;
	}

	public String getTitulo() {
		return titulo;
	}

	public float getValor() {
		return valor;
	}
	
	
	
}
