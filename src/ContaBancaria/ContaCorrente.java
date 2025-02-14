package ContaBancaria;

public class ContaCorrente {

	private double saldo;

	private final double chequeEspecial;

	private double cheque = 0.0;

	private double valor;

	// constructor
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
		if (saldo <= 500) {
			this.chequeEspecial = 50.00;
		} else {
			this.chequeEspecial = saldo * 0.5;
		}
	}

	// get and set
	public double getSaldo() {
		return saldo;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void sacarSaldo(double valor) {
		if (saldo > valor) {

			this.saldo -= valor;

		} else if (saldo <= valor && (saldo + chequeEspecial) >= valor) {

			this.valor = valor;
			cheque = (valor - this.saldo) * 0.2;

			if (cheque != 0) {
				this.saldo = this.saldo - valor - cheque;
			} else {
				this.saldo = this.saldo - valor;
			}

			// implementar o restante de cheque especial

		} else {
			System.out.println("Valor de Saldo + Cheque especial  insuficientes");
		}

	}

	public void pagarBoleto(double valorb) {
		/*
		 * if(saldo > valor) {
		 * 
		 * this.saldo -=valor;
		 * 
		 * }else if(saldo < valor && (saldo + chequeEspecial) >= valor){
		 * 
		 * double cheque = (this.saldo - valor)*0.2; this.saldo = this.saldo -
		 * (this.saldo - valor) - cheque; // implementar o restante de cheque especial
		 * 
		 * } else { System.out.
		 * println("Valor de Saldo + Cheque especial para o pagamento do boleto  insuficientes"
		 * ); }
		 */

		sacarSaldo(valorb);

	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void usaCheque() {
		if (saldo < 0) {
			System.out.println("O uso do cheque está em R$" + valor + " mais juro de 20%, R$" + cheque);
		}

	}
}
