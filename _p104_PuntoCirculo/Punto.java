package _p104_PuntoCirculo;

class Punto {
    private int X;
    private int Y;

    public Punto() {
        this.X = 0;
        this.Y = 0;
    }

    public Punto(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public double getDistancia(Punto punto) {
        int dx = this.X - punto.getX();
        int dy = this.Y - punto.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }
}