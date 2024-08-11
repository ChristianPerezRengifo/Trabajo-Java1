package Trabajos;
//calculadora try-catch
public class trabajo3 {

    public static void main(String[] args) {

            int num1 = 10;
            int num2 = 0;

            try {
                System.out.println("Resultado de suma: " + realizarSuma(num1, num2));
                System.out.println("Resultado de resta: " + realizarResta(num1, num2));
                System.out.println("Resultado de multiplicación: " + realizarMultiplicacion(num1, num2));
                System.out.println("Resultado de división: " + realizarDivision(num1, num2));

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        public static int realizarSuma(int a, int b) {
            return a + b;
        }

        public static int realizarResta(int a, int b) {
            return a - b;
        }

        public static int realizarMultiplicacion(int a, int b) {
            return a * b;
        }

        public static int realizarDivision(int a, int b) {
            if (b == 0) throw new ArithmeticException("División por cero.");
            return a / b;
        }
    }
