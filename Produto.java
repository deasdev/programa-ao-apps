import java.util.Arraylist;
import java.util.list;


class Produto ( ) {
    private int id;
    private String nome;
    private double = preço;

    public Produto(int id, String nome, double preço){
        this.id =id;
        this.nome = nome;´
        this.preço = preço;

    }


public int getId (){
    return id;
}
public String getNome (){
    return nome;
}
public double getPreço;
return preço;

}

class Pedido{
    private int numero;
    private String data;
    private List<Produto> produtos;

public Pedido(int numero, String data){
    this.numero = numero;
    this.data = data
    this.produtos = new Arraylist<>();
}
public int getNumero(){
    return numero;
}
public String getData(){
    return data;
}
public void adicionarProduto(Produto produto){
    produtos.add(produto);
    System.out.println("Produto" + produto.getNome() + " adicionando ao pedido.");
}
public class Mains{
    public static void main (String[]args) {
        Produto produto1 = new Produto(id:1,nome"Camiseta",preço:29,90);
        Produto produto2 = new Produto(id:2,nome"Calça",preço:79,90);
    
        Pedido pedido = new Pedido(numero:101. data:"2024-11-21");
        Pedido.adicionarProduto(Produto1);
        Pedido.adicionarProduto(Produto2);

        System.out.println("Pedido numero:" + pedido.getNumero());
        System.out.println("Data do pedido:" + pedido.getData());
   

}

}