package secondPartOfEx;

public class FirstEx2 {

    /*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    он прямоугольным. */

    public void ex(int x,int y){
        if(x<=0||y<=0||x+y>=180){
            System.out.print("это не треугольник");
        }
        else if(x==90||y==90||x+y-180==90){
            System.out.print("прямоугольный треугольник");
        }
        else System.out.println("это треугольник");
    }

}
