
public class Empregadoteste {
	public static void main(String[] args) {
		Empregado e1;
		e1 = new Empregado();
		e1.nome = "Liclele";
		e1.cargo = "maluco";
		e1.salario = 1000;
		
		e1.imprimirInfo(); 
		e1.aumentarSalario(15);
		e1.imprimirInfo();
		
	}	

}
