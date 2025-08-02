class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public void falar() {
        System.out.println("Eu sou "+nome+" Tenho "+idade+" Anos, e "+altura+" de altura");
    }
}

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.altura = 1.78;
        p1.nome = "Pedro";
        p1.idade = 25;

        p1.falar();
    }
}
