import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.iterasys.Main;

public class CalculosTest {

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
}
