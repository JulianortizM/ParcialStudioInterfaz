
public class PotenciaParcial {


    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else if (exponente > 0) {
            double resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado = multiplicar(resultado, base);
            }
            return resultado;
        } else {
            return 1 / calcularPotencia(base, -exponente);
        }
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        int base = 3; 
        int exponente = 5; 

        double resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }
}

