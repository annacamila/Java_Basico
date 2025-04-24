package com.hamburgueria;

import java.util.Arrays;
import java.util.List;

public class Pedido {

    private final List<String> cardapio = Arrays.asList("Cheddar Bacon", "X-Salada", "X-Burger");

    public String realizarPedido(String nomeHamburguer) {
        if (cardapio.contains(nomeHamburguer)) {
            return "Pedido confirmado";
        } else {
            return "Item não está disponível no cardápio";
        }
    }
}
