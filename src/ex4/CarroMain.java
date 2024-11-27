package ex4;

public class CarroMain {
    public static void main(String[] args) {

        // Criação do objeto carro
        Carro carro = new Carro();

        // Definindo os valores das propriedades do carro
        carro.modelo = "Civic SI";
        carro.cor = "Vermelho";
        carro.ano = 2005;
        carro.anoQueEstamoss = 2024;

        // Exibindo as informações do carro
        carro.fichaDoCarro();

        // Exibindo detalhes adicionais do carro
        // Removemos a linha que estava duplicando a impressão do modelo
        System.out.println("O Carro é do ano de: " + carro.ano);
        System.out.println("O carro tem em média: " + carro.idadeDoCarro() + " anos");

    }
}
