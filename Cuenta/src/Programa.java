import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        double ingreso;
        double extraccion;
        double comprobar = 0;
        double saldo;

        while (true) {

            System.out.println("Dame 1 para ingresar, 2 para sacar y 3 para salir");

            int UserImput = (new Scanner(System.in)).nextInt();

            if (UserImput == 1) {
                System.out.println("Cuanto quieres ingresar");
                ingreso = (new Scanner(System.in).nextDouble());

                System.out.println("Ahora tu cuenta tiene: " + cuenta.depositar(ingreso));
            }

            if (UserImput == 2) {
                System.out.println("Cuanto quieres retirar");
                extraccion = (new Scanner(System.in).nextDouble());
                comprobar = cuenta.sacar(extraccion);
                if (comprobar == -1) {
                System.out.println("No tienes esa cantidad de dinero");
                }else  {
                    System.out.println("Ahora tu cuenta tiene: " + comprobar);
                }

            }
            if (UserImput == 3) {
                break;
            }
        }


    }

}
