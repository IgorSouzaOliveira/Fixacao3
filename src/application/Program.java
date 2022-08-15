package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Tax payer " + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char ch = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();

				list.add(new Fisica(name, rendaAnual, gastoSaude));

			} else {
				System.out.print("Number of employees: ");
				Integer numPessoa = sc.nextInt();
				list.add(new Juridica(name, rendaAnual, numPessoa));
			}

		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : list) {
			double imposto = pessoa.imposto();
			System.out.println(pessoa.getName() + " $ " + String.format("%.2f", pessoa.imposto()));
			sum += imposto;

		}

		System.out.println();
		System.out.println("TOTAL TAXES: " + " $ " + String.format("%.2f", sum));

		sc.close();

	}

}
