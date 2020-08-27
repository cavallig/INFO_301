package gui;
import info301.Point2D ;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * TODO : Ajouter la gestion de la souris et du clic pour placer les elements
 */
public class GeomCanvas extends Canvas {


    private ArrayList<Point2D> points ;

    /**
     *
     */
    public GeomCanvas() {
        this.points = new ArrayList<Point2D>();

    }

    /**
     *
     * @param p
     */
    public void addPoint(Point2D p){
        this.points.add(p) ;
    }

    /**
     * Dessine une serie de point dans le context graphique
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.drawPoints(g) ;
    }

    /**
     *
     * @param g
     */
    private void drawPoints(Graphics g) {
        Iterator<Point2D> pointit = this.points.iterator() ;
        Point2D point2draw ;
        while(pointit.hasNext()){
            point2draw = pointit.next() ;
            this.drawPoint(point2draw,g);
        }
    }

    /**
     * Desssiner un point a partir de ses coordonnées dans les context graphique
     * @param point2draw
     * @param g
     */
    private void drawPoint(Point2D point2draw, Graphics g) {
        int xo = point2draw.getX() - 1 ;
        int yo = point2draw.getY() - 1 ;

        g.fillRect(xo, yo, 3, 3);
    }
}
