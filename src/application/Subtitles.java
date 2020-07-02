package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subtitles {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Digite o nome da legenda: ");
		String nome = sc.nextLine();
		FileWriter arq = new FileWriter(nome + ".srt");
		PrintWriter gravarArq = new PrintWriter(arq);
		int number = 0;
		char N;
		do {
			System.out.printf("Digite o tempo em que a fala inicia(hh:mm:ss,ccc)");
			String i = sc.nextLine();
			System.out.println();
			System.out.printf("Digite o tempo em que a fala termina(hh:mm:ss,ccc)");
			String f = sc.nextLine();
			System.out.println("Digite o texto:");
			String t = sc.nextLine();
			number = number + 1;
			String r = number + "\n" + i + " --> " + f + "\n" + t;
			list.add(r);

			System.out.printf("Mais alguma fala? (s/n) ");
			N = sc.nextLine().charAt(0);
		} while (N != 'n');
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < list.size(); i++) {
			gravarArq.println(list.get(i));
			gravarArq.println();
			System.out.println(list.get(i));
			System.out.println();

		}

		System.out.println("--------------------------------------------------------------");
		System.out.println("A legenda foi salva!");

		arq.close();
		sc.close();

	}

}
