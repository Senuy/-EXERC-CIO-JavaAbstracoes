package ContaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ContaCorrente conta = null;
		/*
		 * ContaCorrente conta = new ContaCorrente(600.00); ContaCorrente conta2 = new
		 * ContaCorrente(1500.00);
		 * 
		 * System.out.println(conta.getSaldo());
		 * System.out.println(conta.getChequeEspecial());
		 * 
		 * //conta.deposito(500.00);
		 * 
		 * //System.out.println(conta.getSaldo());
		 * 
		 * conta.sacarSaldo(600.00);
		 * 
		 * System.out.println(conta.getSaldo());
		 * 
		 * conta.pagarBoleto(250);
		 * 
		 * System.out.println(conta.getSaldo());
		 * 
		 * conta.usaCheque();
		 */

		while (true) {
			System.out.println("\n === Menu ===");
			System.out.println("1 - Criar Conta");
			System.out.println("2 - Consultar  Saldo");
			System.out.println("3 - Consultar Cheque Especial");
			System.out.println("4 - Depositar");
			System.out.println("5 - Sacar");
			System.out.println("6 - Pagar Boleto");
			System.out.println("7 - Está usando Cheque especial?");
			System.out.println("0 - SAIR");
			System.out.println("Escolha uma opcao: ");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				if (conta == null) {
					System.out.println("Digite o saldo inicial: ");
					double saldo = scanner.nextDouble();
					conta = new ContaCorrente(saldo);
				} else {
					System.out.println("Conta já criada");
				}
				break;

			// ----------------------------------------------------------
			case 2:
				if (conta != null) {
					System.out.println("Saldo da Conta R$" + conta.getSaldo());
				} else {
					System.out.println("Criei uma conta primeiro");
				}
				break;
			// ----------------------------------------------------------
			case 3:
				if (conta != null) {
					System.out.println("Saldo Cheque Especial R$" + conta.getChequeEspecial());
				} else {
					System.out.println("Criei uma conta primeiro");
				}
				break;
			// ----------------------------------------------------------
			case 4:
				if (conta != null) {
					System.out.println("Insira um valor a depositar R$");
					double deposito = scanner.nextDouble();
					conta.deposito(deposito);
				} else {
					System.out.println("Criei uma conta primeiro");
				}
				break;
			// ----------------------------------------------------------
			case 5:
				if (conta != null) {
					System.out.print("Digite um valor a Sacar R$");
					double saque = scanner.nextDouble();
					conta.sacarSaldo(saque);

				} else {
					System.out.println("Criei uma conta primeiro");
				}
				break;
			// ----------------------------------------------------------

			case 6:
				if (conta != null) {
					System.out.print("Insira o valor do boleto R$");
					double saque = scanner.nextDouble();
					conta.pagarBoleto(saque);

				} else {
					System.out.println("Criei uma conta primeiro");
				}
				break;
			// ----------------------------------------------------------
			case 7:
				if (conta != null) {
					conta.usaCheque();
				} else {
					System.out.println("Criei uma conta primeiro");
				}
				break;
			// ----------------------------------------------------------
			case 0:
				System.out.println("Saindo");
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida");
			}
		}
	}

}
