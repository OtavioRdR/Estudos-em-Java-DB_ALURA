package ex4;

public class Carro {

    String modelo;
    int ano;
    String cor;
    int anoQueEstamoss;

    void fichaDoCarro() {
        System.out.println("O nome do carro é: " + modelo);
        System.out.println("A cor do carro é: " + cor);
    }

    int idadeDoCarro() {
        return anoQueEstamoss - ano;
    }
}
