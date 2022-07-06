package diogokemmerich.uno.testeunitario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import diogokemmerich.uno.testeunitario.forma.Triangulo;

public class TrianguloTest {
    public static final int LADO_1 = 1;
    public static final int LADO_2 = 2;
    public static final int LADO_3 = 3;
    double DIFERENCA_ACEITAVEL        = 0.0001;
    private static Triangulo triangulo = new Triangulo();

    public TrianguloTest() {}

    @Before
    public void Objeto(){
        triangulo = new Triangulo();
    }

    @Test
    public void deveriaCalcularUmTriangulo(){
        double areaPapel = 1.732;

        triangulo.setMedida(LADO_1, 1);
        triangulo.setMedida(LADO_2, 0);
        triangulo.setMedida(LADO_3, 2);

        double perimetro     = triangulo.getMedida(LADO_1) + triangulo.getMedida(LADO_2) + triangulo.getMedida(LADO_3);

        double semiPerimetro = perimetro / 2;

        double area1         = semiPerimetro * (semiPerimetro - triangulo.getMedida(LADO_1)) * (semiPerimetro - triangulo.getMedida(LADO_2))
                * (semiPerimetro - triangulo.getMedida(LADO_3));

        double areaFinal     = Math.sqrt(area1);

        assertEquals("A área do triângulo é: ", areaPapel, areaFinal, DIFERENCA_ACEITAVEL);
    }
}
