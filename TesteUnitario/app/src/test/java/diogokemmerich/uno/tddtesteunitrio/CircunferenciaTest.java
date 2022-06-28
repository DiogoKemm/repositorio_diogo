package diogokemmerich.uno.tddtesteunitrio;

import static org.junit.Assert.*;

import diogokemmerich.uno.tddtesteunitrio.formas.Circunferencia;
import diogokemmerich.uno.tddtesteunitrio.formas.Forma;

public class CircunferenciaTest extends Forma {
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas() {
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.setMedida(0, 3);

        double raio = circunferencia.getMedida(0);

        boolean x = raio > 0;

        assertTrue(x);

    }

    @Override
    public double area(int i) {
        return 0;
    }
}
