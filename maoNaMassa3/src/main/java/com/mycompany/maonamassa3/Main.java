/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maonamassa3;

import com.mycompany.maonamassa3.controller.VeiculoController;
import com.mycompany.maonamassa3.view.VeiculoView;
import java.util.Scanner;


/**
 *
 * @author Usuário
 */
public class Main {

    public static void main(String[] args) {

        VeiculoController controller = new VeiculoController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            VeiculoView.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    VeiculoView.exibirListaVeiculos(controller.getVeiculos());
                    break;

                case 2:
                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.nextLine();
                    var veiculo = controller.buscarVeiculoPorPlaca(placa);
                    VeiculoView.exibirDetalhesVeiculo(veiculo);
                    break;

                case 3:
                    VeiculoView.exibirListaVeiculos(controller.getVeiculos());
                    if (!controller.getVeiculos().isEmpty()) {
                        System.out.print("Escolha o número do veículo: ");
                        int index = scanner.nextInt() - 1;
                        if (index >= 0 && index < controller.getVeiculos().size()) {
                            VeiculoView.exibirDetalhesVeiculo(controller.getVeiculos().get(index));
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;

                case 4:
                    VeiculoView.exibirListaClientes(controller.getClientes());
                    break;

                case 5:
                    System.out.println("\n=== MODELOS DISPONÍVEIS ===");
                    controller.getModelos().forEach(modelo
                            -> System.out.println(modelo.getDescricao() + " - "
                                    + modelo.getMarca().getNome() + " - "
                                    + modelo.getCategoria() + " - "
                                    + modelo.getMotor().getPotencia() + "cv"));
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    

}
}
