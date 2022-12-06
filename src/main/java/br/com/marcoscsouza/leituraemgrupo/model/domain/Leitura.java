package br.com.marcoscsouza.leituraemgrupo.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Leitura {
	
	private LocalDateTime dataRegistro;
	private String detalhes;
	private boolean Presencial;
	
	private Grupo grupo;
	private List<Literatura> literaturas;
	
	public Leitura() {
		dataRegistro = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd//MM/yyyy HH:mm");
		return String.format("%s;%s;%s",
				dataRegistro.format(formato), 
				detalhes, 
				Presencial ? "Presencial" : "distância");
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public boolean isPresencial() {
		return Presencial;
	}

	public void setPresencial(boolean ehPresencial) {
		this.Presencial = ehPresencial;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Literatura> getLiteraturas() {
		return literaturas;
	}

	public void setLiteraturas(List<Literatura> literaturas) {
		this.literaturas = literaturas;
	}
	
	

}
