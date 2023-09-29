package senac.java.Views;

import senac.java.Domain.Products;
import senac.java.Domain.Salespersons;
import senac.java.Domain.Users;

public class Imprimir {

    public static void imprimirCadastroVendedor () {

        Salespersons salesperson = new Salespersons();

        System.out.println("\nNome: " + salesperson.name + " " + salesperson.lastName);
        System.out.println("Telefone: " + salesperson.phoneNumber);
        System.out.println("CPF: " + salesperson.cpf);
        System.out.println("E-mail: " + salesperson.email);
        System.out.println("Endereço: " + salesperson.address);

    }

    public static void imprimirCadastroCliente(){

        Users user = new Users();

        System.out.println("\nNome: " + user.name + " " + user.lastName);
        System.out.println("Idade: " + user.age);
        System.out.println("Endereço: " + user.address);
        System.out.println("E-mail: " + user.email);
        System.out.println("Senha: " + user.password);
        System.out.println("CPF: " + user.cpf);

    }

    public static void imprimirCadastroProduto(){

        Products product = new Products();

        System.out.println("\nNome do Produto: " + product.productName);
        System.out.println("Preço: R$ " + product.productPrice);
        System.out.println("Cor do Produto: " + product.productColor);
        System.out.println("Descrição: " + product.productDescription);
        System.out.println("Imagem do Produto: " + product.img);
    }

//    public static void imprimirFinalizacaoSistema(){
//
//        System.out.println("Encerrando...");
//
//    }
}
