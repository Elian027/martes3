import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List listaVehiculos = new ArrayList();
    public static void main(String[] args) {
        int op = -1;
        //List listaVehiculos = new ArrayList();

        //listaVehiculos.add(new vehiculo("Mercedes","E",55));
        //listaVehiculos.add(new Autobus("Mercedes","M20",100,20));
        //listaVehiculos.add(new Turismo("BMW","525",50,4));
        //listaVehiculos.add(new Turismo("VW","Passat",35,4));

        while (op!=0) {
            op = mostrarMenu();
            switch (op) {
                case 1:
                    ingresarDatosVehi();
                    break;
                case 2:
                    ingresarDatosBus();
                    break;
                case 3:
                    ingresarDatosTur();
                    break;
                case 4:
                    imprimirLista((ArrayList) listaVehiculos);
                    break;
            }
        }
        op = -1;

    }
    private static void imprimirLista (ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            vehiculo v = (vehiculo) lista.get(i);
            v.imprimirAtributos();
            System.out.println("");
        }
    }
    private static int mostrarMenu() {
        int op=0;
        System.out.println("MENU DE VEHICULOS");
        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Ingresar autobus");
        System.out.println("3. Ingresar autobus de turismo");
        System.out.println("4. Mostrar vehiculos");
        System.out.println("0. Salir");
        System.out.print("Ingrese la opcion a realizar: ");
        op = sc.nextInt();
        while(op<0||op>4) {
            System.out.print("Opcion incorrecta, ingrese opcion [0-4]: ");
            op = sc.nextInt();
        }
        return op;
    }
    private static void ingresarDatosVehi() {
        String marca, modelo;
        double precioAl=0;
        System.out.println("INGRESAR DATOS DE VEHICULO");
        System.out.print("Ingrese la marca del vehiculo: ");
        marca = sc.next();
        System.out.print("Ingrese el modelo del vehiculo: ");
        modelo = sc.next();
        System.out.print("Ingrese el precio de alquiler: ");
        precioAl = sc.nextDouble();
        listaVehiculos.add(new vehiculo(marca, modelo, precioAl));
    }
    private static void ingresarDatosBus() {
        String marca, modelo;
        double precioAl=0;
        int numPlaza=0;
        System.out.println("INGRESAR DATOS DE AUTOBUS");
        System.out.print("Ingrese la marca del autobus: ");
        marca = sc.next();
        System.out.print("Ingrese el modelo del autobus: ");
        modelo = sc.next();
        System.out.print("Ingrese el precio de alquiler: ");
        precioAl = sc.nextDouble();
        System.out.print("Ingrese el numero de plazas del autobus: ");
        numPlaza = sc.nextInt();
        listaVehiculos.add(new Autobus(marca, modelo, precioAl, numPlaza));
    }
    private static void ingresarDatosTur() {
        String marca, modelo;
        double precioAl=0;
        int numPuertas = 0;
        System.out.println("INGRESAR DATOS DE AUTOBUS");
        System.out.print("Ingrese la marca del autobus turistico: ");
        marca = sc.next();
        System.out.print("Ingrese el modelo del autobus turistico: ");
        modelo = sc.next();
        System.out.print("Ingrese el precio de alquiler: ");
        precioAl = sc.nextDouble();
        System.out.print("Ingrese el numero de puertas: ");
        numPuertas = sc.nextInt();
        listaVehiculos.add(new Turismo(marca, modelo, precioAl, numPuertas));
    }
}