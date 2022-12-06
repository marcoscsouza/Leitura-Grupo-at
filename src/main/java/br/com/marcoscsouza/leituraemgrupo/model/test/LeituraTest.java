package br.com.marcoscsouza.leituraemgrupo.model.test;

import java.util.ArrayList;
import java.util.List;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Grupo;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Leitura;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Literatura;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Livro;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Quadrinho;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Revista;

public class LeituraTest {

	public static void main(String[] args) {

		Livro lv1 = new Livro(2017, "O corvo e outros contos", 42.79f, "Horror", "Edgar Allan Poe", true);
		Quadrinho qd1 = new Quadrinho(2019, "Berserk Deluxe", 353.50f, 1, false, "Kentaro Miura");
		Revista rv1 = new Revista(2021, "PlayStation", 19.90f, "Europa", "Jogos", 285);

		List<Literatura> literaturas = new ArrayList<Literatura>();
		literaturas.add(lv1);
		literaturas.add(qd1);
		literaturas.add(rv1);

		Grupo gp1 = new Grupo(5, "Marcos", false);

		Leitura lt1 = new Leitura();
		lt1.setDetalhes("Leitura para conhecer novas obras");
		lt1.setPresencial(true);
		lt1.setGrupo(gp1);
		lt1.setLiteraturas(literaturas);
		
		System.out.println(lt1);

	}

}
