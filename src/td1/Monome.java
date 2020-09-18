package td1;

/**
 * Composant de la class Polynome
 */
public class Monome {
        public int exposant ;
        public int coefficiant ;

    /**
     *
     * @param exposant
     * @param coefficiant
     */
    public Monome(int exposant, int coefficiant) {
        this.exposant = exposant;
        this.coefficiant = coefficiant;
    }

    public int getExposant() {
        return exposant;
    }

    public void setExposant(int exposant) {
        this.exposant = exposant;
    }

    public int getCoefficiant() {
        return coefficiant;
    }

    public void setCoefficiant(int coefficiant) {
        this.coefficiant = coefficiant;
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
