package br.com.marcoscsouza.leituraemgrupo.model.test;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Quadrinho;

public class QuadrinhoTest {

	public static void main(String[] args) {


		Quadrinho qd1 = new Quadrinho(2019, "Berserk Deluxe", 353.50f, 1, false, "Kentaro Miura");
		
		Quadrinho qd2 = new Quadrinho(2017, "Shingeki no kyojin", 17.60f, 16, true, "Hajime Isayama");
		
		Quadrinho qd3 = new Quadrinho(2021, "Spawn Compendium", 52.96f, 1, true, "Todd McFarlane");
		
		System.out.println(qd1);
		System.out.println(qd2);
		System.out.println(qd3);

	}

}
