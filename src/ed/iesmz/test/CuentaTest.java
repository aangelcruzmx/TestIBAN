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
    void compruebaIban4() {
        assertFalse(cuenta.compruebaIBAN("ES7600246912501234567891"));
    }
    @Test
    void compruebaIban5() {
        assertFalse(cuenta.compruebaIBAN("ES4721000418401234567891"));
    }

    @Test
    void compruebaIban6() {
        assertFalse(cuenta.compruebaIBAN("ES8200491500051234567892"));
    }


    //pruebas pasando los parametros del iban

    @Test
    void generaIBAN1() {
        assertEquals("ES7100302053091234567895", cuenta.generaIBAN("0030","2053","09","1234567895"));
    }



    //generados en automatico
    @Test
    void generaIBAN() {
    }

    @Test
    void compruebaIBAN() {
    }
}