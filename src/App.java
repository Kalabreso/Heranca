import java.util.Scanner;
import modelos.Veículo;
import modelos.Carro;
import modelos.Moto;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();
        carro.setMarca("Porsche");
        carro.setModelo("Porsche911");
        carro.setAno(2024);
        carro.setNumDePortas(2);

        System.out.println("Informações do Carro \n");
        carro.exibirDetalhes();
        System.out.println();

        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("R3 MONSTER ABS");
        moto.setAno(2024);
        moto.setTipoDeGuidao("Longo");
        System.out.println("Informações da Moto");
        moto.exibirDetalhes();
        System.out.println();

        System.out.println(carro instanceof Veículo);
        System.out.println(moto instanceof Veículo);

        // Carro carro = new Carro("Porshe", "Porshe911", 2024);
        // Moto moto = new Moto("Yamaha", "R3 MONSTER ABS", 2024);
        // carro.setName("Porshe");

        // System.out.println();
        // System.out.println();

        System.out.println();
        // System.out.println(carro.toString());
        // System.out.println("imprimir carro");
        // System.out.println(moto.toString());
        System.out.println();
        // System.out.println("imprimir moto");
        // System.out.println();
        // System.out.println(carro instanceof Veículo);
        // System.out.println();
        // System.out.println(moto instanceof Veículo);
        // System.out.println();
        System.out.println();

        scanner.close();

    }
}
