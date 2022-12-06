package br.com.marcoscsouza.leituraemgrupo.model.domain;

public class Quadrinho extends Literatura {
	
	private int volume;
	private boolean finalizado;
	private String ilustrador;
	
	public Quadrinho(int anoPublicado, String titulo, float valor, int volume, boolean finalizado, String ilustrador) {
		super(anoPublicado, titulo, valor);
		this.volume = volume;
		this.finalizado = finalizado;
		this.ilustrador = ilustrador;
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
		sb.append(volume);
		sb.append(";");
		sb.append(finalizado ? "Finalizado" : "Desenvolvimento");
		sb.append(";");
		sb.append(ilustrador);
		
		return sb.toString();
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}
	
	
	
	

}
