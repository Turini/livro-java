package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class TesteSaida {

	public static void main(String[] args) throws IOException {
		
		// saída com OutputStream
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Testando a escrita em arquivo");
		bw.newLine();
		bw.write("Conteúdo na próxima linha");
		bw.close();
		
		// saída com PrintStream
		
		PrintStream out = new PrintStream("saida.txt");
		out.println("Testando a escrita em arquivo");
		out.println("Conteúdo na próxima linha");
		out.close();
	}
}
