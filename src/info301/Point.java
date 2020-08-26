package info301;

public class Point {
    private int x, y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /**
     * Affichage des coordonnées du point dans un repère cartésien
     * @return
     */
    public String toString(){
        return "(" + this.x + "," + this.y + ")" ;
    }
}
