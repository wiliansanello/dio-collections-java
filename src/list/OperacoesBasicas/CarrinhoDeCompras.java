package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

//    public void removerItem(String nome){
//        List<Item> itensParaRemover = new ArrayList<>();
//        for(Item item : carrinhoDeCompras) {
//            if(nome.equalsIgnoreCase(carrinhoDeCompras.nome)){
//                itensParaRemover.add(item);
//            }
//        }
//    }

    public void calcularValorTotal(){
        double valorTotal = 0;

        for(Item item : carrinhoDeCompras) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor total: " + valorTotal);

    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Smartphone Samsung", 1200.0, 1);
        carrinho.adicionarItem("Fritadeira Airfryer Arno", 800.0, 2);
        carrinho.adicionarItem("SmartTV LG", 3000.0, 1);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();

    }
}


