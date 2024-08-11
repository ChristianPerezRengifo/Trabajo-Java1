package Trabajos;


import java.util.Scanner;

public class trabajo1 {
    String nombre;
     public int nota;


    void mostrarNota() {
        System.out.println("Estudiante: " + nombre + ", Nota: " + nota);
    }

    public static class main {

        public static void main(String[] args) {
            var scanner = new Scanner(System.in);


            trabajo1 estudiante1 = new trabajo1();
            System.out.print("Nombre del primer estudiante: ");
            estudiante1.nombre = scanner.next();
            System.out.print("Nota del primer estudiante: ");
            estudiante1.nota = scanner.nextInt();


            trabajo1 estudiante2 = new trabajo1();
            System.out.print("Nombre del segundo estudiante: ");
            estudiante2.nombre = scanner.next();
            System.out.print("Nota del segundo estudiante: ");
            estudiante2.nota = scanner.nextInt();


            trabajo1 estudiante3 = new trabajo1();
            System.out.print("Nombre del tercer estudiante: ");
            estudiante3.nombre = scanner.next();
            System.out.print("Nota del tercer estudiante: ");
            estudiante3.nota = scanner.nextInt();


            double promedio = (estudiante1.nota + estudiante2.nota + estudiante3.nota) / 3.0;


            System.out.println("\nNotas de los estudiantes:");
            estudiante1.mostrarNota();
            estudiante2.mostrarNota();
            estudiante3.mostrarNota();

            System.out.println("\nPromedio de las notas: " + promedio);

            scanner.close();
        }
    }
}


