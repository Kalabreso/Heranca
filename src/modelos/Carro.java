package modelos;

public class Carro extends Veículo {

    private int numDePortas;

    public int getNumDePortas() {

        return numDePortas;

    }

    public void setNumDePortas(int numDePortas) {

        this.numDePortas = numDePortas;
    }

    public void exibirDetalhes() {

        super.exibirDetalhes();

        System.out.println("Número de Portas: " + numDePortas);
    }

}
