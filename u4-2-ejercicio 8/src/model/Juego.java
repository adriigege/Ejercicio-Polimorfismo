package model;

public class Juego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private int fichas;
    private int duracion;

    public Juego(Tablero tablero1, int fichas, int duracion, Jugador jugador1, Jugador jugador2) {
        this.tablero = tablero1;
        this.fichas = fichas;
        this.duracion = duracion;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String jugar() {
        return "";
    }

    @Override
    public String toString() {
        return "|--- Juego ---|\n" +
                 tablero + "\n" +
                "|--- jugador1---|\n" + jugador1 + "\n" +
                "|-- jugador2 ---|\n" + jugador2 + "\n" +
                "| fichas= " + fichas +
                " | duracion= " + duracion + " |\n";
    }
}
