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

    @Test
    void compruebaIban7_1() {
        assertTrue(cuenta.compruebaIBAN("ES7100302053091234567895"));//valor esperado en el anterior generaIBAN1
    }
    @Test
    void compruebaIban7_2() {
        assertTrue(cuenta.compruebaIBAN("ES1700302053091234567895"));//valor GENERADO en el anterior generaIBAN1
    }



    @Test
    void generaIBAN2() {
        assertEquals("ES1000492352082414205416", cuenta.generaIBAN("0049","2352","08","2414205416"));
    }

    @Test
    void generaIBAN3() {
        assertEquals("ES1720852066623456789011", cuenta.generaIBAN("2085","2066","62","3456789011"));
    }

    @Test
    void generaIBAN4() {
        assertNull(cuenta.generaIBAN("2085","2066","62","3456AE9011"));
    }
    @Test
    void generaIBAN5() {
        assertNull(cuenta.generaIBAN("208","2066","62","3456789011"));
    }

    @Test
    void generaIBAN6() {
        assertNull(cuenta.generaIBAN("2080","20A6","62","3456789011"));
    }

    @Test
    void generaIBAN7() {
        assertNull(cuenta.generaIBAN("2080","2086","7","3456789011"));
    }

    @Test
    void generaIBAN8() {
        assertNull(cuenta.generaIBAN("2080","2086","63","34567891"));
    }



    //generados en automatico
    @Test
    void generaIBAN() {
    }

    @Test
    void compruebaIBAN() {
    }
}