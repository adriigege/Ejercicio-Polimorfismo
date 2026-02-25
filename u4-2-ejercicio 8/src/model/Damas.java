package model;

public class Damas extends Juego {
    private int blancas;
    private int negras;

    public Damas(Tablero tablero1, int fichas, int duracion, Jugador jugador1, Jugador jugador2, int blancas, int negras) {
        super(tablero1, fichas, duracion, jugador1, jugador2);
        this.blancas = blancas;
        this.negras = negras;
    }

    public int getBlancas() {
        return blancas;
    }

    public void setBlancas(int blancas) {
        this.blancas = blancas;
    }

    public int getNegras() {
        return negras;
    }

    public void setNegras(int negras) {
        this.negras = negras;
    }

    @Override
    public String jugar() {
        if (getJugador1().getPuntuacion() > getJugador2().getPuntuacion()) {
            return getJugador1().getNombre() + " ha ganado con: " + getJugador1().getPuntuacion() + " puntos.";
        } else if (getJugador1().getPuntuacion() < getJugador2().getPuntuacion()) {
            return getJugador2().getNombre() + " ha ganado con: " + blancas + " blancas y " + negras + " negras.";
        } else {
            return "Empate, ambos tienen los mismos puntos | " + getJugador1().getNombre() + " " + getJugador1().getPuntuacion() + " puntos | " + getJugador2().getNombre() + " " + getJugador2().getPuntuacion() + " puntos | ";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "|--- Damas ---|\n" +
                "| blancas= " + blancas +
                "| negras= " + negras + " |";
    }
}