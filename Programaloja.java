import classes.Cadastrocliente;
import classes.Cliente;
import classes.Produtos;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Programaloja {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = sc.nextLine();
        }
        
        boolean clienteCadastrado = false;

        Cadastrocliente cadastroCliente = new Cadastrocliente();

        clienteCadastrado = cadastroCliente.verificarCadastro();

        if (clienteCadastrado) {
            System.out.println("O cliente já está cadastrado.");
        } else {
            System.out.println("O cliente não possui cadastro.");
        }

        clienteCadastrado = cadastroCliente.verificarCadastro();

        
        cadastroCliente.verificarCadastro();

        Produtos produto1 = new Produtos();

        
        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();

        
        produto1.atualizarQuantidade(50);

       
        System.out.println("\nInformações atualizadas do Produto 1:");
        produto1.exibirInformacoes();

        
        produto1.atualizarPreco(55.0);

        
        System.out.println("\nInformações do Produto 1 após atualizar o preço:");
        produto1.exibirInformacoes();
    }
}


