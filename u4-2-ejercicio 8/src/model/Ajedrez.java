package model;

public class Ajedrez extends Juego {
    private int peones;
    private int figuras;

    public Ajedrez(Tablero tablero1, int fichas, int duracion, Jugador jugador1, Jugador jugador2, int figuras, int peones) {
        super(tablero1, fichas, duracion, jugador1, jugador2);
        this.figuras = figuras;
        this.peones = peones;
    }

    public int getPeones() {
        return peones;
    }

    public void setPeones(int peones) {
        this.peones = peones;
    }

    public int getFiguras() {
        return figuras;
    }

    public void setFiguras(int figuras) {
        this.figuras = figuras;
    }

    @Override
    public String jugar() {
       if (getJugador1().getPuntuacion() > getJugador2().getPuntuacion()) {
           return getJugador1().getNombre() + " ha ganado con: " + getJugador1().getPuntuacion() + " puntos.";
        } else {
           return getJugador2().getNombre() + " ha ganado con: " + peones + " peones y " + figuras + " figuras.";
       }
    }

    @Override
    public String toString() {
        return super.toString() + "|--- Ajedrez ---|\n" +
                "| peones= " + peones +
                " | figuras= " + figuras + " |";
    }
}
