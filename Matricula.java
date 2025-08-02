
class Aluno {
	public String Nome;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	public Double nota4;

	public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public void notaMedia() {
        double media = calcularMedia();
        System.out.println("Média: " + media);
    }

    public void aprovado() {
        double media = calcularMedia();
        if (media >= 6.0) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
public class Matricula {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.Nome = "Julio";
		a1.nota1 = 7.4;
		a1.nota2 = 6.7;
		a1.nota3 = 5.4;
		a1.nota4 = 4.5;
		
		a1.notaMedia();
		
		a1.aprovado();
	}
}