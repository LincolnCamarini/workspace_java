
public class Posto {
	public static void main(String[] args) {
		
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasolina Podium", 6.799);
		
		/* Versão 1.0 - tudo via terminal 
		
		
		b1.abastecerPorLitros(80);
		System.out.println(b1.exibirRecibo());
		
		b1.abastecerPorValor(30);
		System.out.println(b1.exibirRecibo());
		
		*/
		
		/* Versão 2.0 - agora com interface gráfica
		* trocar o System.out.println por JOptionPane.showMessageDialog
		* NOTEM QUE: A CLASSE DE COMBUSTÍVEL NÃO VAI SOFRER NENHUMA ALTERAÇÃO
		*/
		
		b1.abastecerPorLitros(80);
		JOptionPane.showMessageDialog(b1.exibirRecibo());
		
		b1.abastecerPorValor(30);
		JOptionPane.showMessageDialog(b1.exibirRecibo());
	}

}
