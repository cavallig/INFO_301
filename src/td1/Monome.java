package td1;

/**
 * Composant de la class Polynome
 */
public class Monome {
        public double exposant ;
        public double coefficiant ;

    /**
     *
     * @param exposant
     * @param coefficiant
     */
    public Monome(int exposant, int coefficiant) {
        this.exposant = exposant;
        this.coefficiant = coefficiant;
    }

    public double getExposant() {
        return exposant;
    }

    public void setExposant(double exposant) {
        this.exposant = exposant;
    }

    public double getCoefficiant() {
        return coefficiant;
    }

    public void setCoefficiant(double coefficiant) {
        this.coefficiant = coefficiant;
    }


    public double calcul(double x){
        return this.coefficiant * (Math.pow(x,this.exposant)) ;
    }

    /**
     * Surcharge de la methode toString de Object
     * @return
     */
    @Override
    public String toString() {
        String tostr =  this.coefficiant + "X^" + this.exposant ;
        return tostr ;
    }

    static public void main(String args[]){
        System.out.print(new Monome(3,2)) ;

    }
}
