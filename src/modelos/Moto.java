package modelos;

public class Moto extends Veículo {

    private String tipoDeGuidao;

    public String getTipoDeGuidao() {

        return tipoDeGuidao;

    }

    public void setTipoDeGuidao(String tipoDeGuidao) {

        this.tipoDeGuidao = tipoDeGuidao;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo De Guidão: " + tipoDeGuidao);
    }

}
