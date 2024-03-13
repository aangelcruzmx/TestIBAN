package ed.iesmz.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    private Cuenta cuenta;

    @BeforeEach
    void setUp() {

        cuenta = new Cuenta("Titular de Prueba");
    }

    @Test
    void compruebaIban1() {
        assertTrue(cuenta.compruebaIBAN("ES6621000418401234567891"));
    }

    @Test
    void compruebaIban2() {
        assertTrue(cuenta.compruebaIBAN("ES6000491500051234567892"));
    }

    @Test
    void compruebaIban3() {
        assertTrue(cuenta.compruebaIBAN("ES94020805801101234567891"));
    }

    //generados en automatico
    @Test
    void generaIBAN() {
    }

    @Test
    void compruebaIBAN() {
    }
}