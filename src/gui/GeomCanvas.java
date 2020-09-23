package gui;
import info301.Point2D ;
import td1.Polynome;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * TODO : Ajouter la gestion de la souris et du clic pour placer les elements
 * _ ajouter la couleur
 * _ dessiner les point avec des formes couleurs differente
 *
 * _ Polygone, Figure, drawable ... ?
 * _ Btn simple => ajoute au milieu
 * _ Clic au centre + deplacement => depacer la figure => model de donnée
 *
 */
public class GeomCanvas extends Canvas {


    private ArrayList<Point2D> points ;             //liste de points
    private ArrayList<Polygone> polygones ;         //liste de polygones

    private Color c ;

    /**
     *
     */
    public GeomCanvas() {
        //1- initialisation liste des pts
        this.points = new ArrayList<Point2D>();
        //2- initialisation liste des polygones
        this.polygones = new ArrayList<Polygone>() ;

        this.c = Color.BLACK ;
    }

    public GeomCanvas(ArrayList<Polygone> polygones){
        this.polygones = polygones ;
    }


    /**
     *
     * @param p
     */
    public void addPoint(Point2D p){

        this.points.add(p) ;
    }

    /**
     *
     * @param poly
     */
    public void addPolygone(Polygone poly){

        this.polygones.add(poly) ;

    }



    /**
     * Dessine une serie de point dans le context graphique
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(this.c);
        this.drawPolygones(g);
        this.drawPoints(g) ;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    /**
     *
     * @param g
     */
    private void drawPoints(Graphics g) {
        Iterator<Point2D> pointit = this.points.iterator() ;
        Point2D point2draw ;
        //dessiner la liste de point
        while(pointit.hasNext()){
            point2draw = pointit.next() ;
            this.drawPoint(point2draw,g);
        }
    }

    /**
     *
     * @param g
     */
    private void drawPolygones(Graphics g) {
        Iterator<Polygone> polyit = this.polygones.iterator() ;
        Polygone poly2draw ;
        //dessiner la liste de point
        while(polyit.hasNext()){
            poly2draw = polyit.next() ;
            this.drawPolygone(poly2draw,g);
        }
    }

    /**
     * Dessiner un polygone (voir pb selon les points )
     * Utiliser la methode de java ou dessin des ligne
     *
     * I - algo simple parcourir la liste de point du poligone
     * A partir du deuxieme point tracer des ligne
     *
     * @param poly2draw
     * @param g
     */
    private void drawPolygone(Polygone poly2draw, Graphics g) {
        ArrayList<Point2D> pts = poly2draw.getPoints() ;
        int nb_pts = pts.size() ;
        Point2D pt1, pt2 ;
        Point2D pi = pts.get(0) ;
        Point2D pf = pts.get(nb_pts-1) ;

        //1- dessine les lignes entre pts consecutifs
        if( nb_pts >= 2 ) {
            //Iteration sur les pts
            for (int i = 1; i < nb_pts; i++) {
                    pt1 = pts.get(i-1) ;
                    pt2 = pts.get(i) ;
                    g.drawLine(pt1.getX(), pt1.getY(), pt2.getX(), pt2.getY() );
            }

        }

        //2- dessine le dernier segment
        g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY() );

    }


    private void drawEdges(Graphics g){

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

    /**
     *
     * @param args
     */
    public static void main(String args[]){


    }
}
