package senac.java.Views;

import senac.java.Domain.Products;
import senac.java.Domain.Salespersons;
import senac.java.Domain.Users;
import senac.java.Services.Validacao;

import java.util.Scanner;

public class Telas {

    static Scanner sc = new Scanner(System.in);
    static Salespersons salesperson = new Salespersons();
    static Users user = new Users(); // Variável importada de forma global
    static Products product = new Products();

    public static void mostrarMenuInicial(){

        int escolhaInput = 0;

        System.out.println("========== SISTEMA DE CADASTRO ==========");
        System.out.println("OPÇÕES:");
        System.out.println("1 - Cadastro de Vendedor");
        System.out.println("2 - Cadastro de Cliente");
        System.out.println("3 - Cadastro de Produto");
        System.out.println("4 - Sair");

        escolhaInput = Integer.parseInt(sc.nextLine());

        Validacao.escolherOpcao(escolhaInput);

    }

    public static void cadastrarVendedor (){

        System.out.println("========== CADASTRO DE VENDEDOR ==========");

        System.out.println("Digite o primeiro nome do vendendor: ");
        salesperson.name = sc.nextLine();

        System.out.println("Digite o sobrenome do vendendor: ");
        salesperson.lastName = sc.nextLine();

        System.out.println("Digite o número de telefone do vendedor: ");
        salesperson.phoneNumber = sc.nextLine();

        System.out.println("Digite o CPF do vendedor: ");
        salesperson.cpf = sc.nextLine();

        System.out.println("Digite o e-mail do vendedor: ");
        salesperson.email = sc.nextLine();

        System.out.println("Digite o endereço do vendedor: ");
        salesperson.address = sc.nextLine();

        Imprimir.imprimirCadastroVendedor();
    }

    public static void cadastrarCliente(){

        System.out.println("========== CADASTRO DE CLIENTE ==========");

        System.out.println("Digite o primeiro nome: ");
        user.name = sc.nextLine();

        System.out.println("Digite o sobrenome: ");
        user.lastName = sc.nextLine();

        System.out.println("Digite a idade: ");
        user.age = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o endereço: ");
        user.address = sc.nextLine();

        System.out.println("Digite o e-mail: ");
        user.email = sc.nextLine();

        System.out.println("Digite a senha: ");
        user.password = sc.nextLine();

        System.out.println("Digite o CPF: ");
        user.cpf = sc.nextLine();

        Imprimir.imprimirCadastroCliente();
    }

    public static void cadastrarProduto(){

        System.out.println("========== CADASTRO DE PRODUTO ==========");

        System.out.println("Digite o nome do produto: ");
        product.productName = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        product.productPrice = sc.nextLine();

        System.out.println("Digite a cor do produto: ");
        product.productColor = sc.nextLine();

        System.out.println("Digite a descrição do produto:");
        product.productDescription = sc.nextLine();

        System.out.println("Insira uma imagem do produto: ");
        product.img = sc.nextLine();

        Imprimir.imprimirCadastroProduto();
    }

    public static void finalizarSistema(){

        System.out.println("Saindo...");
    }
}
