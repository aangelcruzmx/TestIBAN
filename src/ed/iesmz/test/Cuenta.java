package ed.iesmz.test;

public class Cuenta {
    private String nombreCompleto;
    private String numeroCuenta;

    private final String letrasIBAN = "ES";
    private final String valorLetrasIBAN = "142800"; // Son los valores asociados a las letras ES

    public Cuenta(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Cuenta(String nombreCompleto, String numeroCuenta) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCuenta = numeroCuenta;
    }

    // Genera el IBAN dado entidad, oficina, dígito de control y cuenta
    public String generaIBAN(String entidad, String oficina, String digitoControl, String cuenta) {
        if (!entidad.matches("\\d{4}") || !oficina.matches("\\d{4}") || !digitoControl.matches("\\d{2}") || !cuenta.matches("\\d{10}")) {
            return null; // Retorna null si el parametro no cumple con los requisitos
        }

        String cadenaIBAN = entidad + oficina + digitoControl + cuenta + valorLetrasIBAN + "00";
        int digitoControlIBAN = calcularDigitoControl(cadenaIBAN);
        String digito = String.format("%02d", digitoControlIBAN); // Asegura que el digito de control sea de dos dígitos
        System.out.println("digito" + digito);
        return letrasIBAN + digito + entidad + oficina + digitoControl + cuenta;
    }

    // Verifica si el IBAN es correcto
    public boolean compruebaIBAN(String IBAN) {
        if (IBAN == null || !IBAN.matches("ES\\d{22}")) {
            return false; // Verifica el formato del IBAN
        }

        String reordenado = IBAN.substring(4) + "1428" + IBAN.substring(2, 4);
        java.math.BigInteger numeroIBAN = new java.math.BigInteger(reordenado);
        return numeroIBAN.mod(new java.math.BigInteger("97")).intValue() == 1;
    }

    private int calcularDigitoControl(String cadenaIBAN) {
        java.math.BigInteger numIBAN = new java.math.BigInteger(cadenaIBAN);
        System.out.println("depuracion: " + numIBAN); // linnea para imprimir y depurar
        int digitoControl = 98 - numIBAN.mod(new java.math.BigInteger("97")).intValue();
        return digitoControl;

    }

    private void metodoAyuda(){
        System.out.println("Este metodo es de prueba porque no me esta dejando hacer commits");
        int x = 20;
        for (int i = 0; i < 10 ; i++) {
            x = x * 2;
        }
    }
}
