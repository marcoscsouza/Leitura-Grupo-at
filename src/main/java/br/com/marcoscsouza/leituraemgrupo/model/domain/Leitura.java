package br.com.marcoscsouza.leituraemgrupo.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.com.marcoscsouza.leituraemgrupo.exceptions.GrupoInvalidoException;
import br.com.marcoscsouza.leituraemgrupo.exceptions.LiteraturaInvalidoException;

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
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s;%s;%s",
				dataRegistro.format(formato), 
				detalhes, 
				Presencial ? "Presencial" : "distância");
	}
	
	public void imprimir() throws GrupoInvalidoException, LiteraturaInvalidoException {
		if (grupo == null) {
			throw new GrupoInvalidoException("Precisa ter um grupo vinculado!");
		}
		    
		if (grupo.getIntegrantes() < 2) {
			throw new GrupoInvalidoException("O grupo precisar ter pelo menos 2 integrantes!");
		}
		if (literaturas.size() == 0) {
			throw new LiteraturaInvalidoException("Precisa ter pelo menos um tipo de literatura para ler");
		}
		
		System.out.printf("Leitura: %s;%s;%d\n", this.toString(), grupo, literaturas.size());
		System.out.println("Literaturas: ");
		for (Literatura literatura : getLiteraturas()) {
			System.out.println(literatura);
		}

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
