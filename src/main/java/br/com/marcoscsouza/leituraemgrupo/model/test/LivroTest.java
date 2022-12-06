package br.com.marcoscsouza.leituraemgrupo.model.test;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Livro;

public class LivroTest {

	public static void main(String[] args) {


		Livro lv1 = new Livro(2017, "O corvo e outros contos", 42.79f, "Horror", "Edgar Allan Poe", true);
		Livro lv2 = new Livro(2014, "O chamado de Cthulhu e outros contos", 17.95f, "Horror", "H. P. Lovecraft", true);
		Livro lv3 = new Livro(2007, "Head first! Java", 149.90f, "Didático", "Bert bates", false);
		
		System.out.println(lv1);
		System.out.println(lv2);
		System.out.println(lv3);

	}

}
