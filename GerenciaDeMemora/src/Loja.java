
public class Loja {
	public static void main(String[])args) {
		
		Produto p1;
		
		p1 = new Produtod(1, "Computador", 2000.00);
		
		System.out.println(p1.exibirInfo());
		
		Produto p2;
		
		p2 = p1; // pergunta: dupliquei a �rea de mem�ria?
		
		// simula��o: vou alterar o pre�o do produto p2
		// de 2000.00 vai para 2500.00
		
		// se efetivamente, ao atribuir p2 = p1 n�s duplic�ssemos a �rea de
		// mem�ria, eu alteraria o produto p2 oproduto p1 ficaria 
		
		p2.setPreco(2550.00);
		
		System.out.println("------- ap�s a altera��o do pre�o de p2");
		System.out.println("p1 = "+p1.exibirInfo());
		System.out.println("p2 = "+p2.exibirInfo()");"
				+ ""
				+ "p2 = new Produto(p1.getId(), p1.getDescricao(), p1.getPreco());
	}
}
