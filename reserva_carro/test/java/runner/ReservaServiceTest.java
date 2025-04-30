package runner;

import org.junit.Assert;
import org.junit.Test;
import reserva.ReservaService;

public class ReservaServiceTest {

    @Test
    public void testeReservaDentroDaArea() {
        ReservaService service = new ReservaService();
        String resultado = service.reservar("Belo Horizonte", "Rua A");
        Assert.assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testeReservaForaDaArea() {
        ReservaService service = new ReservaService();
        String resultado = service.reservar("São Paulo", "Av. B");
        Assert.assertEquals("Área fora de cobertura", resultado);
    }
}
