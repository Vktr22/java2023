
package negyzetprogram;


public class Negyzet {
    int a;
    Koord koord;
    
    public double terulet() {
        return a+a;
    }
    puplic String allapot() {
        return "Negyzet(" + "a=" + a + ", x=" + koord.x + ", y=" + koord.y + ")";
    }
}
