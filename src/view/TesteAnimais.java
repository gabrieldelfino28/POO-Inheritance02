package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {

    public static void main(String[] args) {
        List<Animal> JardimZoologico = new ArrayList<>();
        Animal a1 = new Animal();
        Peixe a2 = new Peixe();
        Mamifero a3 = new Mamifero();
        a1.alteraNome("Camelo");
        a1.alteraComprimento(150);
        a1.alteraPatas(4);
        a1.alteraCor("Amarelo");
        a1.alteraAmbiente("Terra");
        a1.alteraVelocidade(2.0f);

        a2.alteraNome("Tuburão");
        a2.alteraComprimento(300);
        a2.alteraVelocidade(1.5f);

        a3.alteraNome("Urso-do-Canadá");
        a3.alteraComprimento(180);
        a3.alteraPatas(4);
        a3.alteraCor("Vermelho");
        a3.alteraAmbiente("Terra");
        a3.alteraVelocidade(0.5f);
        a3.alteraAlimento("Mel");

        JardimZoologico.add(a1);
        JardimZoologico.add(a2);
        JardimZoologico.add(a3);

        for(Animal a : JardimZoologico) {
            System.out.println("---------------------------------");
            a.dados();
        }
    }
}
