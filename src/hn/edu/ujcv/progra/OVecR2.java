package hn.edu.ujcv.progra;
import java.lang.Math.*;

public class OVecR2 {
    // miembros
    private double x;
    private double y;

    // constructores
    public OVecR2(){}

    public OVecR2(OVecR2 a){}

    public OVecR2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    // accesoras y mutadoras
    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    // metodos
    public OVecR2 suma(OVecR2 b){
        return new OVecR2(this.x + b.x,this.y + b.x);
    }

    public OVecR2 resta(OVecR2 b){
        return new OVecR2( this.x - b.x ,  this.y - b.x);
    }

    public double prodPunto(OVecR2 b)
    {
        double res;
        res = this.x * b.x + this.y * b.y;
        return res;
    }

    public double magnitud(){
        double res;
        res = Math.sqrt((Math.pow(this.x,2)) + Math.pow(this.y,2));
        return res;
    }
    @Override
    public String toString() { return "x; "+getX()+" j: "+getY();}



}
