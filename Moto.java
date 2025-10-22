// Integrantes:
//Fábio Kaio Gois Torres, 
//Julia Amorim da Costa Rabelo, 
//Lehoiaqim de Souza Silva
//Rayane Rafaela do Carmo Silva
//Rubem de Moraes Falcão Neto

//moto herda de veiculo
public class Moto extends Veiculo {
    //atributo privado cilindradas
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }
    //getter e setter
    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }
    //sobrescreva para calcularIpva de 2,5%
    @Override
    public double calcularIpva() {
        return getValor() * 0.025;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas + 
               ", IPVA: R$" + String.format("%.2f", calcularIpva());
    }
}
