package br.com.marcoscsouza.leituraemgrupo.model.domain;

public class Revista extends Literatura {
	
	private String instituto;
	private String categoria;
	private int edicao;
	
	public Revista(int anoPublicado, String titulo, float valor, String instituto, String categoria, int edicao) {
		super(anoPublicado, titulo, valor);
		this.instituto = instituto;
		this.categoria = categoria;
		this.edicao = edicao;
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
		sb.append(instituto);
		sb.append(";");
		sb.append(categoria);
		sb.append(";");
		sb.append(edicao);
		
		return sb.toString();
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	

}
