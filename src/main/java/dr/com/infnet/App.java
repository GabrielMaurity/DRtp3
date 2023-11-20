package dr.com.infnet;

import java.util.logging.Logger;

public class App {

    // Obtém um logger para a classe Calculadora
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        // Números para a multiplicação
        int numero1 = 2;
        int numero2 = 2;

        // Realiza a multiplicação
        int resultado = multiplicar(numero1, numero2);

        // Loga o resultado
        logger.info("O resultado da multiplicação de " + numero1 + " e " + numero2 + " é: " + resultado);
    }

    // Função para multiplicação
    private static int multiplicar(int a, int b) {
        return a * b;
    }
}
