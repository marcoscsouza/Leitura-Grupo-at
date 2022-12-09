package br.com.marcoscsouza.leituraemgrupo.model.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Grupo;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Leitura;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Livro;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Quadrinho;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Revista;

public class ArquivoTest {

	public static void main(String[] args) {
		System.out.println("ola");

		try {

			try {

				String dir = "c:/dev/";
				String arq = "grupoLeitura.txt";

				FileReader file = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(file);

				FileWriter fileW = new FileWriter(dir + "out_" + arq);
				BufferedWriter escrita = new BufferedWriter(fileW);

				String linha = leitura.readLine();

				String[] campos = null;

				int qtde = 0;
				String nomeResponsavel = "";
				String dataRegistro = "";

				while (linha != null) {

					campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					
					case "P":
						
						boolean valorBool0 = true;
						if ("Estudo".equals(campos[5])) {
							valorBool0 = true;
						}else {
							valorBool0 = false; 
						}
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						Leitura lt = new Leitura();
						
						lt.setDetalhes(campos[1]);
						lt.setPresencial("Presencial".equals(campos[2]) ? true : false );
						
						Grupo gp = new Grupo(
								Integer.valueOf(campos[3]),
								campos[4],
								valorBool0
								);
						
						
						escrita.write(lt.toString() + gp.toString() + "\r\n"); 
						nomeResponsavel = gp.getNomeResponsavel();

						dataRegistro = lt.getDataRegistro().format(formatter);
						
						break;

					case "L":
						
						boolean valorBool = true;
						if ("Traduzido".equals(campos[6])) {
							valorBool = true;
						}else {
							valorBool = false; 
						}
						
						Livro l = new Livro(
								Integer.valueOf(campos[1]),
								campos[2],
								Float.valueOf(campos[3]),
								campos[4],
								campos[5],
								valorBool								
								);
						
						escrita.write(l.toString() + "\r\n");
						qtde++;

						break;

					case "R":
						
						Revista r = new Revista(
								Integer.valueOf(campos[1]),
								campos[2],
								Float.valueOf(campos[3]),
								campos[4],
								campos[5],
								Integer.valueOf(campos[6])
								);
						escrita.write(r.toString() + "\r\n");
						qtde++;
						

						break;

					case "Q":
						boolean valorBool2 = true;
						if ("Finalizado".equals(campos[5])) {
							valorBool2 = true;
						}else {
							valorBool2 = false; 
						}
						
						Quadrinho q = new Quadrinho(
								Integer.valueOf(campos[1]),
								campos[2],
								Float.valueOf(campos[3]),
								Integer.valueOf(campos[4]),
								valorBool2,
								campos[6]
								);
						
						escrita.write(q.toString() + "\r\n");
						qtde++;
						
						break;

					default:
						System.out.println("Literatura ainda não mapeada:  " + linha);
						break;
					}

					linha = leitura.readLine();

				}

				escrita.write(qtde + ";" + nomeResponsavel + ";" + dataRegistro + "\r\n");

				leitura.close();
				file.close();

				escrita.close();
				fileW.close();

			} catch (IOException e) {
				System.out.println("[ERROR] " + e.getMessage());
			}

		} finally {
			System.out.println("Processamento realizado com sucesso!!!");
		}

	}

}
