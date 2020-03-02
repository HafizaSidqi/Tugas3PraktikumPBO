/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Ikhsan
 */
public class Volume {
        double balok(double p, double l, double t){
        return p*l*t;
    }
    double kerucut(double r, double t){
        double phi;
        phi = 3.14;
        double alas;
        alas = phi * r *r;
        return alas *t;
    }
    double limas_segitiga(double a_segitiga, double t_segitiga, double t){
        return (a_segitiga*t_segitiga)/2*t;
    }
}
