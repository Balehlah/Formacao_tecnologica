
class Carro {
	public String modelo;
	public String cor;
	public int velocidadeAtual;
	
	public void velocidade() {
		System.out.println(velocidadeAtual+" km/h");
	};
	
	public void acelerar() {
		System.out.println(velocidadeAtual+10+" km/h");
	};
	
	public void frear() {
		System.out.println(velocidadeAtual-10+" km/h");
	};
}
public class Dirigir {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		c1.modelo = "Astra";
		c1.cor = "Cinza";
		c1.velocidadeAtual = 70;
		
        c1.velocidade();

		c1.acelerar();
		
		c1.frear();
	}
}