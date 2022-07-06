package diogokemmerich.uno.testeunitario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import diogokemmerich.uno.testeunitario.forma.Triangulo;

public class TrianguloTest {
    public static final double LADO_1 = 1;
    public static final double LADO_2 = 2;
    public static final double LADO_3 = 3;
    double DIFERENCA_ACEITAVEL        = 0.0001;
    private static Triangulo triangulo = new Triangulo();

    public TrianguloTest() {}

    @Before
    public void objeto(){
        triangulo = new Triangulo();
    }

    @Test
    public void deveriaCalcularUmTriangulo(){
        double areaPapel = 1.732;

        triangulo.setMedida(0, 2);
        triangulo.setMedida(1, 2);
        triangulo.setMedida(2, 2);

        double perimetro     = triangulo.getMedida(0) + triangulo.getMedida(1) + triangulo.getMedida(2);

        double semiPerimetro = perimetro / 2;

        double area1         = semiPerimetro * (semiPerimetro - triangulo.getMedida(0)) * (semiPerimetro - triangulo.getMedida(1))
                * (semiPerimetro - triangulo.getMedida(2));

        double areaFinal     = Math.sqrt(area1);

        assertEquals("A área do triângulo é: ", areaPapel, areaFinal, DIFERENCA_ACEITAVEL);
    }
}
