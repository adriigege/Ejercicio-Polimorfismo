package model;

public class Tres_en_raya extends Juego {
    private int movimientos;

    public Tres_en_raya(Tablero tablero1, int fichas, int duracion, Jugador jugador1, Jugador jugador2) {
        super(tablero1, fichas, duracion, jugador1, jugador2);
        movimientos = (int) (Math.random() * 10) + 1;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String jugar() {
        int puntuacionJugador1 = 0;
        int puntuacionJugador2 = 0;
        String movimiento = "";

        for (int i = 1; i <= getMovimientos(); i++) {
            getJugador1().setPuntuacion((int) (Math.random() * 10) + 1);
            getJugador2().setPuntuacion((int) (Math.random() * 10) + 1);

            if (getJugador1().getPuntuacion() > getJugador2().getPuntuacion()) {
                puntuacionJugador1 += 1;
                movimiento += "Movimiento " + i + " | " + "puntuación de " + getJugador1().getNombre() + ": " + getJugador1().getPuntuacion() + " | " + " puntuación de " + getJugador2().getNombre() + ": " + getJugador2().getPuntuacion() + " | " + getJugador1().getNombre() + " suma 1 punto.\n";
            } else if ((getJugador1().getPuntuacion() < getJugador2().getPuntuacion())) {
                puntuacionJugador2 += 1;
                movimiento += "Movimiento " + i + " | " + "puntuación de " + getJugador1().getNombre() + ": " + getJugador1().getPuntuacion() + " | " + " puntuación de " + getJugador2().getNombre() + ": " + getJugador2().getPuntuacion() + " | " + getJugador2().getNombre() + " suma 1 punto.\n";
            }
            if ((getJugador1().getPuntuacion() == getJugador2().getPuntuacion())) {
                puntuacionJugador1 += 1;
                puntuacionJugador2 += 1;
                movimiento += "Movimiento " + i + " | " + "puntuación de " + getJugador1().getNombre() + ": " + getJugador1().getPuntuacion() + " | " + " puntuación de " + getJugador2().getNombre() + ": " + getJugador2().getPuntuacion() + " | " + "empate, ambos suman 1 punto.\n";
            }
        }
        if (puntuacionJugador1 > puntuacionJugador2) {
            return movimiento + getJugador1().getNombre() + " ha ganado con un total de " + puntuacionJugador1 + " puntos.";
        } else if (puntuacionJugador1 < puntuacionJugador2){
            return movimiento + getJugador2().getNombre() + " ha ganado con un total de " + puntuacionJugador2 + " puntos.";
        } else {
            return movimiento + "Se ha producido un empate | " + getJugador1().getNombre() + " " + puntuacionJugador1 + " puntos | " + getJugador2().getNombre() + " " + puntuacionJugador2 + " puntos |";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "|--- Tres_en_raya ---|\n" +
                "| movimientos= " + movimientos + " |";
    }
}
