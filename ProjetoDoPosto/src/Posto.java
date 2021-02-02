
public class Posto {
	public static void main(String[] args) {
		
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasolina Podium", 6.799);
		
		/* Vers�o 1.0 - tudo via terminal 
		
		
		b1.abastecerPorLitros(80);
		System.out.println(b1.exibirRecibo());
		
		b1.abastecerPorValor(30);
		System.out.println(b1.exibirRecibo());
		
		*/
		
		/* Vers�o 2.0 - agora com interface gr�fica
		* trocar o System.out.println por JOptionPane.showMessageDialog
		* NOTEM QUE: A CLASSE DE COMBUST�VEL N�O VAI SOFRER NENHUMA ALTERA��O
		*/
		
		b1.abastecerPorLitros(80);
		JOptionPane.showMessageDialog(b1.exibirRecibo());
		
		b1.abastecerPorValor(30);
		JOptionPane.showMessageDialog(b1.exibirRecibo());
	}

}
