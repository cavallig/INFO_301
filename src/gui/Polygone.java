package gui;

import java.awt.*;
import java.util.ArrayList;
import info301.* ;


/**
 * Definit un polygone comme une liste de point
 *
 * _ coordonnées relative au premier point
 * _ dessin de la figure dans un contexte graphique
 */
public class Polygone {
        private ArrayList<Point2D> pts ;

        /**
         *
         */
        public Polygone(ArrayList<Point2D> pts){
            this.pts = pts ;
        }

    public ArrayList<Point2D> getPoints() {
        return this.pts ;
    }

    public void setPoints(ArrayList<Point2D> points) {
        this.pts = points;
    }
}
