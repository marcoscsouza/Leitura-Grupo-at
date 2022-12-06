package br.com.marcoscsouza.leituraemgrupo.model.domain;

public class Livro extends Literatura {
	
	private String genero;
	private String autor;
	private boolean traduzido;

	public Livro(int anoPublicado, String titulo, float valor, String genero, String autor, boolean traduzido) {
		super(anoPublicado, titulo, valor);
		this.genero = genero;
		this.autor = autor;
		this.traduzido = traduzido;
	}

	@Override
	public String calcularRaridade() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(genero);
		sb.append(";");
		sb.append(autor);
		sb.append(";");
		sb.append(traduzido ? "Traduzido" : "Sem tradução");
		
		return sb.toString();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isTraduzido() {
		return traduzido;
	}

	public void setTraduzido(boolean traduzido) {
		this.traduzido = traduzido;
	}

	
	

}
