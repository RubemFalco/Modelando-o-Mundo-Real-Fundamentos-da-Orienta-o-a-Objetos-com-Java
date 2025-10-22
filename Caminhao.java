// Integrantes:
//Fábio Kaio Gois Torres, 
//Julia Amorim da Costa Rabelo, 
//Lehoiaqim de Souza Silva
//Rayane Rafaela do Carmo Silva
//Rubem de Moraes Falcão Neto

//caminhão herda de veículo
public class Caminhao extends Veiculo {
   //atributo privado 
    private double capacidadeCarga;
    
    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }
    //getter & setter
    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }
//sobrescreve o método calcularIpva
    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5)
            return getValor() * 0.02;
        else
            return getValor() * 0.03;
    }
//sobrescreve o método calcularIpva
    @Override
    public String toString() {
        return super.toString() + ", Carga: " + capacidadeCarga + "t" + 
               ", IPVA: R$" + String.format("%.2f", calcularIpva());
    }
}
