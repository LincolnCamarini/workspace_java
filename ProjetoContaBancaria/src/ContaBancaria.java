
public class ContaBancaria {
	private int numeroConta;
	private int digitoVerif;
	private String cpfTitular;
	private String nomeTitular;
	private double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	void exibirInfo ( ) {
		String res = numeroConta+ "-"+digitoVerif+" : " +nomeTitular+"(+cpfTitular+") R$ "+saldo;"
		return res;
	}

}
