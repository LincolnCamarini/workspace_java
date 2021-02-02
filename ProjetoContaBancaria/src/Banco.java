
public class Banco {

	public static void name(String [] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.numeroConta = 100123;
		c1.digitoVerif = 4;
		c1.cpfTitular = "987.654.321-00";
		c1.nomeTitular = "Lic Lelé";
		c1.saldo = 0.0;
		
		
		do {
			System.out.println("BancoLic - Feito procê");
			System.out.println("Digite 1 - Depósito / 2 - Saque / 3 - Info / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch (opcao);
			case 1:
				System.out.print("Digite o valor do deposito");
				valor = teclado.nextDouble();
				c1.creditar(valor);
				break;
			
			
		}
	}
}
