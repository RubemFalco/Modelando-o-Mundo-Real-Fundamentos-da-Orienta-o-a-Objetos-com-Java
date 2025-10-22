// Integrantes:
//Fábio Kaio Gois Torres, 
//Julia Amorim da Costa Rabelo, 
//Lehoiaqim de Souza Silva
//Rayane Rafaela do Carmo Silva
//Rubem de Moraes Falcão Neto

//carro herda de veículo
public class Carro extends Veiculo {
    //atributo privado numeroPortas
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
        super(placa, marca, modelo, ano, valor);
        this.numeroPortas = numeroPortas;
    }
    //getter & setter
    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }
    //sobrescreva calcularIpva para retornar 3,5%
    @Override
    public double calcularIpva() {
        return getValor() * 0.035;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas: " + numeroPortas + 
               ", IPVA: R$" + String.format("%.2f", calcularIpva());
    }
}
