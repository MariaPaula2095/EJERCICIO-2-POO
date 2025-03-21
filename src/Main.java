import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        boolean estado=true;
        List<Vehiculo> lsVehiculos = new ArrayList<>();

        do {


        System.out.println("""
                1. CREAR AUTO
                2. CREAR MOTOCICLETA
                3. LISTA TOTAL DE VEHICULOS
                4. SALIR
                """);
        op= teclado.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("INGRESE DATOS DEL AUTO");
                System.out.println("MARCA: ");
                String marca = teclado.next();

                System.out.println("MODELO: ");
                String modelo = teclado.next();

                System.out.println("AÑO: ");
                int anio = teclado.nextInt();

                System.out.println("PRECIO BASE: ");
                double precioBase = teclado.nextDouble();

                System.out.println("NUMERO DE PUERTAS: ");
                int numeroPuertas = teclado.nextInt();

                Auto carro = new Auto(marca, modelo, anio, precioBase, numeroPuertas);
                lsVehiculos.add(carro);
                System.out.println("EL AUTO CREADO ES: " + carro);
                System.out.println("EL PRECIO FINAL CON EL 10% DE DESCUENTO ES: "+ carro.calcularPrecioFinal());
            }
            case 2 -> {
                System.out.println("INGRESE DATOS DE LA MOTOCICLETA");
                System.out.println("MARCA: ");
                String marca = teclado.next();

                System.out.println("MODELO: ");
                String modelo = teclado.next();

                System.out.println("AÑO: ");
                int anio = teclado.nextInt();

                System.out.println("PRECIO BASE: ");
                double precioBase = teclado.nextDouble();

                System.out.println("CILINDRAJE: ");
                int cilindrada = teclado.nextInt();

                Motocicleta moto = new Motocicleta(marca, modelo, anio, precioBase, cilindrada);
                lsVehiculos.add(moto);
                System.out.println("EL AUTO CREADO ES: " + moto);
                System.out.println("EL PRECIO FINAL CON EL 10% DE DESCUENTO ES: "+ moto.calcularPrecioFinal());


            }
            case 3 -> {
                System.out.println("LOS VEHICULOS CREADOS SON: ");
                for (Vehiculo total : lsVehiculos) {
                    System.out.println(total);
                }

            }
            case 4 -> {
                System.out.println("¡HA SALIDO DEL PROGRAMA!");
                estado=false;
            }
        }
        }while (estado);
    }
}