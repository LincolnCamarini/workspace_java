
public class ContaBancaria {

	int numeroConta;
	int digitoVerif;
	String cpfTitular;
	String nomeTitular;
	double saldo;
	
	 void creditar(double valor) --> basicamente soma ao saldo o valor
	 
	 System.out.println("saldo =" +saldo);
	 System.out.println("Info =" +saldo);
	 System.out.println("saldo =" +saldo);
}


+ void creditar(double valor) --> basicamente soma ao saldo o valor
+ void exibirInfo()           --> mostra todos os dados na tela
+ double consultarSaldo()     --> apenas retorna o valor do saldo
+ boolean debitar(double valor) --> se o valor for inferior ou igual ao saldo, atualiza o saldo e 
retorna "true", indicando  que deu certo, se o valor for superior, 
retorna "false" e não modifica o saldo