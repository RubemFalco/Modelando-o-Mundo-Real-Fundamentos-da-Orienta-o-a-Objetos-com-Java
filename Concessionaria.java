// Integrantes:
//Fábio Kaio Gois Torres, 
//Julia Amorim da Costa Rabelo, 
//Lehoiaqim de Souza Silva
//Rayane Rafaela do Carmo Silva
//Rubem de Moraes Falcão Neto

public class Concessionaria {
    public static void main(String[] args) {

        // Criando um array de 7 veículos
        Veiculo[] veiculos = new Veiculo[7];

        // Adicionando Carros
        veiculos[0] = new Carro("ABC1234", "Toyota", "Corolla", 2020, 95000, 4);
        veiculos[1] = new Carro("DEF5678", "Honda", "Civic", 2019, 88000, 4);
        veiculos[2] = new Carro("GHI9012", "Fiat", "Argo", 2021, 72000, 4);

        // Adicionando Motos
        veiculos[3] = new Moto("JKL3456", "Yamaha", "Fazer", 2022, 22000, 250);
        veiculos[4] = new Moto("MNO7890", "Honda", "CG", 2020, 15000, 160);

        // Adicionando Caminhões
        veiculos[5] = new Caminhao("PQR1234", "Volvo", "FH 540", 2021, 500000, 10);
        veiculos[6] = new Caminhao("STU5678", "Mercedes", "Atego", 2018, 280000, 4.5);

        // Exibindo todos os veículos
        System.out.println("=== LISTA DE VEÍCULOS DA CONCESSIONÁRIA ===");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println(veiculos[i].toString());
        }
    }
}
