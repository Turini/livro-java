package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TesteEntrada {

	public static void main(String[] args) throws FileNotFoundException {

		// entrada com InputStream
		
		try {
			InputStream is = new FileInputStream("teste.txt");
//			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			String linha = reader.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo " + e);
		}
		
		// entrada com Scanner
		
		Scanner scanner = new Scanner(new File("teste.txt"));
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
}
