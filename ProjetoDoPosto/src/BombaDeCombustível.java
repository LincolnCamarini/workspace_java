
public class BombaDeCombustível {
	private String nomeCombustivel;
	private double precoLitro;
	private double qtdeLitros;
	private doubre valorTotal;
	
	public BombaDeCombustivel(String nomeCombustivel, double precoLitro) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro      = 
	}
	
	public void abastecerPorLitros(double qtde) {
		this.qtdeLitros = qtde; //eu quero aumentar a quantidade de informações
		this.valorTotal = this.qtdeLitros x this.precoLitro;
	}
	
	public void abastecerPorValor(double total) {
		this.valorTotal = total;
		this.qtdeLitros = this.valorTotal / this.precoLitro
	}
	
	public String exibirRecibo() {
		String recibo =  "======================================\n"
						+"      LincCorp (c) - Gas & Energy     \n"
						+"--------------------------------------\n"
						+" Combustivel : +nomeCombustivel+ "\n"
						+" PrecoLitro  : R$ "+String.format(""%.3f", precoLitro) + "\n""
						+" Litros      : " + String.format("%.3f, qtdeLitros) + "\n""
						+" VALOR TOTAL : r$ "String.format(%.2f, valorTotal) + "\n""
	}
	
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
	public doubre getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(doubre valorTotal) {
		this.valorTotal = valorTotal;
	}
}

