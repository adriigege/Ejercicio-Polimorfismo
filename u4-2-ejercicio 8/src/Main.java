import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jugador jugador1 = null;
        Jugador jugador2 = null;
        Tablero tablero1 = null;
        int menu = 0;
        char juego = 0;
        int filas = 0;
        int columnas = 0;

        do {
            System.out.println("------------------MENÚ PRINCIPAL------------------");
            System.out.println("1.Iniciar juego.\n2.Salir.");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("-----------------CREAR A JUGADOR 1----------------");
                    System.out.println("Nombre del jugador1: ");
                    jugador1 = new Jugador(sc.next());
                    System.out.println("-----------------CREAR A JUGADOR 2-----------------");
                    System.out.println("Nombre del jugador2: ");
                    jugador2 = new Jugador(sc.next());
                    System.out.println("-------------------CREAR TABLERO-------------------");
                    System.out.println("Número de filas del tablero: ");
                    filas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Número de columnas del tablero: ");
                    columnas = sc.nextInt();
                    sc.nextLine();
                    tablero1 = new Tablero(filas, columnas);
                    do {
                        System.out.println("-------------------ESCOGER JUEGO-------------------");
                        System.out.println("a.Ajedrez.\nb.Damas.\nc.3 en raya.\nd.Salir al menu principal.");
                        juego = sc.next().charAt(0);
                        switch (juego) {
                            case 'a', 'A':
                                Juego ajedrez1 = new Ajedrez(tablero1, 10, 5, jugador1, jugador2, 10, 30);
                                System.out.println("----------------RESULTADO DEL JUEGO----------------");
                                System.out.println(ajedrez1.jugar());
                                System.out.println("-------------CARACTERISTICAS GENERALES-------------");
                                System.out.println(ajedrez1);
                                break;
                            case 'b', 'B':
                                Juego damas1 = new Damas(tablero1, 15, 30, jugador1, jugador2, 5, 2);
                                System.out.println("----------------RESULTADO DEL JUEGO----------------");
                                System.out.println(damas1.jugar());
                                System.out.println("-------------CARACTERISTICAS GENERALES-------------");
                                System.out.println(damas1);
                                break;
                            case 'c', 'C':
                                Juego tresEnRaya1 = new Tres_en_raya(tablero1, 8, 10, jugador1, jugador2);
                                System.out.println("----------------RESULTADO DEL JUEGO----------------");
                                System.out.println(tresEnRaya1.jugar());
                                System.out.println("-------------CARACTERISTICAS GENERALES-------------");
                                System.out.println(tresEnRaya1);
                                break;
                            case 'd', 'D':
                                break;
                            default:
                                System.out.println("Opción no valida.");
                                break;
                        }
                    } while (juego != 'd' && juego != 'D');
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (menu != 2);
    }
}