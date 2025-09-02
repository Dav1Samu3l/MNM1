/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.view;

import com.mycompany.maonamassa3.model.Modelo;
import com.mycompany.maonamassa3.model.Veiculo;
import com.mycompany.maonamassa3.model.Cliente;


/**
 *
 * @author Usuário
 */
public class VeiculoView {
    public static void exibirDetalhesVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            System.out.println("Veículo não encontrado!");
            return;
        }
        
        System.out.println("\n=== DETALHES DO VEÍCULO ===");
        System.out.println("Placa: " + veiculo.getPlaca());
        
        if (veiculo.getCliente() != null) {
            System.out.println("Proprietário: " + veiculo.getCliente().getNome());
            System.out.println("Celular: " + veiculo.getCliente().getCelular());
            System.out.println("Email: " + veiculo.getCliente().getEmail());
        } else {
            System.out.println("Proprietário: Não informado");
        }
        
        if (veiculo.getCor() != null) {
            System.out.println("Cor: " + veiculo.getCor().getNome());
        }
        
        if (veiculo.getModelo() != null) {
            Modelo modelo = veiculo.getModelo();
            System.out.println("Modelo: " + modelo.getDescricao());
            
            if (modelo.getMarca() != null) {
                System.out.println("Marca: " + modelo.getMarca().getNome());
            }
            
            System.out.println("Categoria: " + modelo.getCategoria());
            
            if (modelo.getMotor() != null) {
                System.out.println("Potência: " + modelo.getMotor().getPotencia() + "cv");
                System.out.println("Combustível: " + modelo.getMotor().getTipoCombustivel());
            }
        }
        
        if (veiculo.getObservacoes() != null && !veiculo.getObservacoes().isEmpty()) {
            System.out.println("Observações: " + veiculo.getObservacoes());
        }
        
        System.out.println("===========================");
    }
    
    public static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE VEÍCULOS ===");
        System.out.println("1. Listar todos os veículos");
        System.out.println("2. Buscar veículo por placa");
        System.out.println("3. Exibir detalhes de um veículo");
        System.out.println("4. Listar clientes");
        System.out.println("5. Listar modelos disponíveis");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void exibirListaVeiculos(java.util.List<Veiculo> veiculos) {
        System.out.println("\n=== LISTA DE VEÍCULOS ===");
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (int i = 0; i < veiculos.size(); i++) {
                Veiculo v = veiculos.get(i);
                System.out.println((i + 1) + ". " + v.getPlaca() + " - " + 
                    (v.getModelo() != null ? v.getModelo().getDescricao() : "Sem modelo") +
                    " - " + (v.getCliente() != null ? v.getCliente().getNome() : "Sem proprietário"));
            }
        }
    }
    
    public static void exibirListaClientes(java.util.List<Cliente> clientes) {
        System.out.println("\n=== LISTA DE CLIENTES ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                Cliente c = clientes.get(i);
                System.out.println((i + 1) + ". " + c.getNome() + " - " + c.getEmail() +
                    " - Veículos: " + c.getVeiculos().size());
            }
        }
    } 
}
