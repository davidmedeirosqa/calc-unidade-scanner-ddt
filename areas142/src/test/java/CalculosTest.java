import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;

public class CalculosTest {

    // Foi criada uma estrutura básica para testar a área do triângulo.
    // Divergência no uso da classe Scanner sendo chamada diretamente no parâmetro.
    public static int calculoAreaRetangulo(int base, int altura) {
        return base * altura;
    }

    // Foi criada uma estrutura básica para testar a área do triângulo.
    // Divergência no uso da classe Scanner sendo chamada diretamente no parâmetro.
    public static float calculoAreaTriangulo(float base, float altura) {
        return (base * altura) / 2;
    }

    @Test
    public void testAreaQuadrado() {
        Scanner scanner = new Scanner("5"); // Declarando valor manualmente
        int valorEsperado = 25;
        int valorAtual = Main.areaQuadrado(scanner);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAreaRetangulo() {
        Scanner scanner = new Scanner("5 3"); // Declarando valor manualmente
        int valorEsperado = 15;
        int valorAtual = Main.areaRetangulo(scanner);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAreaCirculo() {
        Scanner scanner = new Scanner("5"); // Declarando valor manualmente
        float valorEsperado = 78.54f;
        float valorAtual = Main.areaCirculo(scanner);
        assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testAreaTriangulo() {
        Scanner scanner = new Scanner("5 3"); // Declarando valor manualmente
        float valorEsperado = 7.5f;
        float valorAtual = Main.areaTriangulo(scanner);
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
        int valorAtual = calculoAreaRetangulo(base, altura);
        assertEquals(resultadoEsperado, valorAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/area-triangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void testAreaTrianguloDDT(float base, float altura, float resultadoEsperado) {
        float valorAtual = calculoAreaTriangulo(base, altura);
        assertEquals(resultadoEsperado, valorAtual);
    }

}
