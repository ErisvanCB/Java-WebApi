package senac.java.Services;

import senac.java.Views.Telas;

import static java.lang.System.exit;

public class Validacao {

    public static void escolherOpcao (int escolhaInput){

        Telas tela = new Telas();

        switch (escolhaInput){

            case  1:

                tela.cadastrarVendedor();
                break;

            case 2:

                tela.cadastrarCliente();
                break;

            case 3:

                tela.cadastrarProduto();
                break;

            case 4:
                tela.finalizarSistema();
                exit(0);

                break;

            default:
                System.out.println("Ocorreu um erro ao selecionar uma opção!");
                break;
        }
    }


}
