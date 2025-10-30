import org.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro();
    }

    @Test
    public void deveLigarCarroDesligado() {
        carro.setEstado(CarroEstadoDesligado.getInstance());
        assertTrue(carro.ligar());
        assertEquals(CarroEstadoLigado.getInstance(), carro.getEstado());
    }

    @Test
    public void deveDesligarCarroLigado() {
        carro.setEstado(CarroEstadoLigado.getInstance());
        assertTrue(carro.desligar());
        assertEquals(CarroEstadoDesligado.getInstance(), carro.getEstado());
    }

    @Test
    public void deveAcelerarCarroLigado() {
        carro.setEstado(CarroEstadoLigado.getInstance());
        assertTrue(carro.acelerar());
        assertEquals(CarroEstadoEmMovimento.getInstance(), carro.getEstado());
    }

    @Test
    public void deveFrearCarroEmMovimento() {
        carro.setEstado(CarroEstadoEmMovimento.getInstance());
        assertTrue(carro.frear());
        assertEquals(CarroEstadoParado.getInstance(), carro.getEstado());
    }

    @Test
    public void deveDesligarCarroParado() {
        carro.setEstado(CarroEstadoParado.getInstance());
        assertTrue(carro.desligar());
        assertEquals(CarroEstadoDesligado.getInstance(), carro.getEstado());
    }

    @Test
    public void deveQuebrarCarroLigado() {
        carro.setEstado(CarroEstadoLigado.getInstance());
        assertTrue(carro.quebrar());
        assertEquals(CarroEstadoComPane.getInstance(), carro.getEstado());
    }

    @Test
    public void deveConsertarCarroComPane() {
        carro.setEstado(CarroEstadoComPane.getInstance());
        assertTrue(carro.consertar());
        assertEquals(CarroEstadoEmManutencao.getInstance(), carro.getEstado());
    }

    @Test
    public void deveLigarCarroEmManutencao() {
        carro.setEstado(CarroEstadoEmManutencao.getInstance());
        assertTrue(carro.ligar());
        assertEquals(CarroEstadoLigado.getInstance(), carro.getEstado());
    }
}
