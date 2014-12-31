
package festival.metier;

import java.util.Date;

public class Projection {
    
    private int numProjection;
    private Date dateProjection;
    private Date hDebut;
    private Date hFin;
    
    public Projection(int numProjection, Date dateProjection, Date hDebut, Date hFin) {
        this.numProjection = numProjection;
        this.dateProjection = dateProjection;
        this.hDebut = hDebut;
        this.hFin = hFin;
    }

    public int getNumProjection() {
        return numProjection;
    }

    public Date getDateProjection() {
        return dateProjection;
    }

    public Date gethDebut() {
        return hDebut;
    }

    public Date gethFin() {
        return hFin;
    }

    public void setNumProjection(int numProjection) {
        this.numProjection = numProjection;
    }

    public void setDateProjection(Date dateProjection) {
        this.dateProjection = dateProjection;
    }

    public void sethDebut(Date hDebut) {
        this.hDebut = hDebut;
    }

    public void sethFin(Date hFin) {
        this.hFin = hFin;
    }

    
    
}
