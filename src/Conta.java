
public class Conta {
	double saldo = 0;
	int agencia;
	int numero;
	Cliente titular;
	

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
