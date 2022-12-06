package br.com.marcoscsouza.leituraemgrupo.model.test;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Revista;

public class RevistaTest {

	public static void main(String[] args) {


		Revista rv1 = new Revista(2021, "PlayStation",19.90f, "Europa", "Jogos", 285);
		
		Revista rv2 = new Revista(2002, "A imagem do 3º Reich", 28.90f, "Globo", "Historia", 1);
		
		Revista rv3 = new Revista(2021, "Contigo: Big Brother Brasil 2021", 19.90f, "Perfil", "Atualidades", 74);
		
		System.out.println(rv1);
		System.out.println(rv2);
		System.out.println(rv3);

	}

}
