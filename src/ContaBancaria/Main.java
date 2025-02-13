package ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(600.00);
		ContaCorrente conta2 = new ContaCorrente(1500.00);
				
		System.out.println(conta.getSaldo());
		System.out.println(conta.getChequeEspecial());
		
		//conta.deposito(500.00);
		
		//System.out.println(conta.getSaldo());
		
		conta.sacarSaldo(600.00);
	
		System.out.println(conta.getSaldo());
		
		conta.pagarBoleto(250);

		System.out.println(conta.getSaldo());
		
		conta.usaCheque();
	}

}
