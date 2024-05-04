package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for(Item item : itemList) {
                if(item.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(item);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        if(!itemList.isEmpty()) {
            for(Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Não há itens na lista");
        }
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public String toString() {
        return "Itens \n"
                + itemList ;
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Smartphone", 1200d, 1);
        carrinho.adicionarItem("Fritadeira", 800d, 2);
        carrinho.adicionarItem("SmartTV", 3000d, 1);

        carrinho.exibirItens();

        carrinho.removerItem("SmartTV");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();    }
}


