package com.hamburgueria;

import java.util.Scanner;

public class Hamburgueria {
    
    public static void main(String[] args) {
        // Cardápio da hamburgueria
        String[] cardapio = {"Cheddar Bacon", "X-Burguer", "X-Salada", "X-Tudo"};

        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao cliente que informe o nome do hambúrguer
        System.out.print("Digite o nome do hambúrguer: ");
        String pedido = scanner.nextLine();

        // Valida o pedido
        if (isPedidoValido(pedido, cardapio)) {
            System.out.println("✅ Pedido confirmado para: " + pedido);
        } else {
            System.out.println("❌ Item não está disponível no cardápio.");
        }
        
        scanner.close();
    }

    // Método que valida se o hambúrguer está no cardápio
    public static boolean isPedidoValido(String pedido, String[] cardapio) {
        for (String item : cardapio) {
            if (item.equalsIgnoreCase(pedido)) {
                return true; // Pedido válido
            }
        }
        return false; // Pedido inválido
    }
}
