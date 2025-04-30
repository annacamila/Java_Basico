package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import reserva.ReservaService;

public class ReservaSteps {
    private ReservaService service;
    private String cidade;
    private String endereco;
    private String resultado;

    @Given("que a cidade informada é {string} e o endereço é {string}")
    public void queACidadeInformadaE(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @When("eu realizo a reserva")
    public void euRealizoAReserva() {
        service = new ReservaService();
        resultado = service.reservar(cidade, endereco);
    }

    @Then("a mensagem retornada deve ser {string}")
    public void aMensagemRetornadaDeveSer(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}
