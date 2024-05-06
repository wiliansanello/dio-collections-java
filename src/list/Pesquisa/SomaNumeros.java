package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros = new ArrayList<>();

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int resultadoSoma = 0;
        if (!listaNumeros.isEmpty()) {
            for(int i = 0; i < listaNumeros.size(); i++) {
                resultadoSoma += listaNumeros.get(i);
            }
            return resultadoSoma;
        } else {
            throw new RuntimeException("Não há números para somar");
        }
    }

    public int encontrarMaiorNumero(){
       int maiorNumero = Collections.max(listaNumeros);
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Collections.min(listaNumeros);
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return listaNumeros;
    }

    public static void main(String[] args) {

        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(3);
        System.out.println("Itens da lista: " + soma.exibirNumeros());
        System.out.println("Soma dos itens: " + soma.calcularSoma());
        soma.adicionarNumero(18);
        soma.exibirNumeros();
        System.out.println("Itens da lista: " + soma.exibirNumeros());
        System.out.println("Soma dos itens: " + soma.calcularSoma());
        soma.adicionarNumero(3);
        soma.exibirNumeros();
        System.out.println("Itens da lista: " + soma.exibirNumeros());
        System.out.println("Soma dos Itens: " + soma.calcularSoma());
        soma.adicionarNumero(4);
        soma.exibirNumeros();
        System.out.println("Itens da lista: " + soma.exibirNumeros());
        System.out.println("Soma dos itens: " + soma.calcularSoma());

        System.out.println("O maior número da lista é: " + soma.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + soma.encontrarMenorNumero());
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }
}
