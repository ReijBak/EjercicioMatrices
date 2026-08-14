import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] ME = new int[n][n];
        ObjMatriz[][] MO = new ObjMatriz[n][n];
        while (continuar) {
            System.out.println("¿Qué desea realizar?\n" +
                    "1: llenar matriz de enteros\n" +
                    "2: Mostrar matriz de enteros\n" +
                    "3: Mostrar diagonal superior de matriz de enteros\n" +
                    "4: Llenar matriz Objetual\n" +
                    "5: Mostrar matriz Objetual\n" +
                    "6: Mostrar diagonal superior de matriz Objetual\n" +
                    "7: Salir del sistema"
            );
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    ME = m.LLenarMatrizEntera(ME);
                    break;
                case 2:
                    m.MostrarMatrizEntera(ME);
                    break;
                case 3:
                    m.MostrarDiagonalSupMatrizEntera(ME);
                    break;
                case 4:
                    MO = m.LlenarMatrizObjetual(MO);
                    break;
                case 5:
                    m.MostrarMatrizObjetual(MO);
                    break;
                case 6:
                    m.MostrarDiagonalSupMatrizObjetual(MO);
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esa opcion no existe por favor validar...");
                    break;
            }
        }
    }
}