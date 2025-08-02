abstract class Animal {
	private String nome;
	public abstract void emitirSom();
	public void andar() {
		System.out.print("andar do animal");
		}
}
class Gato extends Animal {
	public void andar() {
	System.out.print(" Andar do gato");
	}
	public void emitirSom(){
		System.out.print(" Miau Miau Miau Miau");
	}
}
public class Test {
	public static void main(String[] args) {
	Animal a1 = new Gato();
	Gato a2 = new Gato();
	Animal a3 = (Animal) a2;
	a3.andar();
	a3.emitirSom();		
    }
}