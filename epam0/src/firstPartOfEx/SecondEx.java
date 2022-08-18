package firstPartOfEx;

public class SecondEx {
    // 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

    public double ex(double a, double b, double c){
        return (b+Math.sqrt(Math.pow(b,2)+4*a*c)/2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
    }
}
