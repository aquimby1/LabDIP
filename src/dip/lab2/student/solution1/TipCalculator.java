/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author aquimby1
 */
public interface TipCalculator {
    static final double MIN_BILL = 0.00;
    
     public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
     
    public abstract double getTip();

    public ServiceQuality getServiceQuality();
    
    public void setServiceRating(ServiceQuality q);
}
