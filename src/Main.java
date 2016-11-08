import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dam on 4/11/16.
 */
public class Main {
    public static void main(String[] args) {
        coche coche = new coche("6666TEM", 5);
        microbus microbus = new microbus("1234ASD", 25);
        carga carga = new carga("5842UKL", 50);
        camiones camiones = new camiones("9856DAM");
        List<vehiculos> vehiculos = new ArrayList<>();
        vehiculos.add(camiones);
        vehiculos.add(carga);
        vehiculos.add(coche);
        vehiculos.add(microbus);
        String matricula;
        int dias;
        do {
            matricula=pedirCadena("Escribe la matricula");
        } while (!matricula.equalsIgnoreCase(coche.getMatricula()) && !matricula.equalsIgnoreCase(microbus.getMatricula()) && !matricula.equalsIgnoreCase(camiones.getMatricula()) && !matricula.equalsIgnoreCase(carga.getMatricula()));
        dias = pedirEntero("Escribe el numero de dias");
        if (matricula.equalsIgnoreCase(coche.getMatricula())){
            System.out.println(coche.precioFinal(dias));
        }
        if (matricula.equalsIgnoreCase(microbus.getMatricula())){
            System.out.println(microbus.precioFinal(dias));
        }
        if (matricula.equalsIgnoreCase(carga.getMatricula())){
            System.out.println(carga.precioFinal(dias));
        }
        if (matricula.equalsIgnoreCase(camiones.getMatricula())){
            System.out.println(camiones.precioFinal(dias));
        }
    }

    public static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta = "";
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                respuesta = br.readLine();
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida");
                error = true;
            }
        } while (error);
        return respuesta;
    }
    public static int pedirEntero(String mensaje) {
        // Variable para leer datos del teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Variable para guardar el nº introducido por el usuario
        int numero = 0;
        // variable para comprobar si ha habido error al introducir el nº
        boolean error;
        do {
            try {
                // mostramos el msg para el usuario para pedir dato
                System.out.println(mensaje);
                // Leemos dato del teclado y lo convertimos a entero
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un nº entero.");
                error = true;
            }
        } while (error);
        return numero;
    }
}
