package diogokemmerich.uno.testeunitario;


import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

import diogokemmerich.uno.testeunitario.forma.Circunferencia;

public class CircunferenciaTest {
    public static final Circunferencia circunferencia = new Circunferencia();
    public static final int POSICAO_ZERO                     = 0;
    public static final int EXPOENTE_2                       = 2;

    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidadas(){
        circunferencia.setMedida(0, 1);
        double raio       = circunferencia.getMedida(0);
        boolean validacao = raio > 0;
        assertTrue(validacao);
    }
    @Test
    public void deveriaCalcularAreaDaCircunferencia(){
        //O cálculo da área de uma circunferência é dada pela fórmula: A = PI * Raio ao quadrado
        int PRECISAO_4_CASAS_DECIMAIS = 4;

        double area_raio3             = 28.2743;
        double area_raio4             = 50.2655;
        double area_raio5             = 78.5398;

        circunferencia.setMedida(POSICAO_ZERO, 3);

        double area = Math.PI * Math.pow(circunferencia.getMedida(POSICAO_ZERO), EXPOENTE_2);

        assertEquals("A área de uma circunferência de raio 3 é 28,2743", area_raio3, area, PRECISAO_4_CASAS_DECIMAIS);
    }
}
