package steps;

import com.hamburgueria.Pedido;
import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

public class PedidoSteps {

    private Pedido pedido;
    private String resultado;

    @Dado("que o cardápio está carregado")
    public void queOCardapioEstaCarregado() {
        pedido = new Pedido();
    }

    @Quando("o cliente pedir o hambúrguer {string}")
    public void oClientePedirOHamburguer(String nomeHamburguer) {
        resultado = pedido.realizarPedido(nomeHamburguer);
    }

    @Então("o sistema deve confirmar o pedido de {string}")
    public void oSistemaDeveConfirmarPedido(String nomeHamburguer) {
        assertEquals("Pedido confirmado", resultado);
    }

    @Então("o sistema deve informar que o hambúrguer não está disponível")
    public void oSistemaDeveInformarQueOHamburguerNaoEstaDisponivel() {
        assertEquals("Item não está disponível no cardápio", resultado);
    }
}
