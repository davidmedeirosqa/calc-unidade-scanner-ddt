import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;

public class CalculosTest {

    @Test
    public void testAreaQuadrado() {
        int valorEsperado = 25;
        int valorAtual = Main.areaQuadrado(5);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAreaRetangulo() {
        int valorEsperado = 15;
        int valorAtual = Main.areaRetangulo(5, 3);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAreaCirculo() {
        float valorEsperado = 78.54f;
        float valorAtual = Main.areaCirculo(5);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAreaTriangulo() {
        float valorEsperado = 7.5f;
        float valorAtual = Main.areaTriangulo(5, 3);
        assertEquals(valorEsperado, valorAtual);
    }

    // --> Data Driven Testing (DDT)

    @ParameterizedTest
    @CsvSource(value = {
            "5, 3, 15",
            "4, 2, 8",
            "5, 5, 25",
            "9, 3, 27"
    }, delimiter = ',')
    public void testAreaRetanguloDDT(int base, int altura, int resultadoEsperado) {
        int valorAtual = Main.areaRetangulo(base, altura);
        assertEquals(resultadoEsperado, valorAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/area-triangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void testAreaTrianguloDDT(float base, float altura, float resultadoEsperado) {
        float valorAtual = Main.areaTriangulo(base, altura);
        assertEquals(resultadoEsperado, valorAtual);
    }

}
