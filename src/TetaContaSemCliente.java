
public class TetaContaSemCliente {

	public static void main(String[] args) {
		
		//Criando a conta da marcela
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);
		
		//Criando o cliente Marcela
		contaDaMarcela.titular = new Cliente();
		//Ligando a conta para o cliente
				
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
