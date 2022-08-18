package thirdPartOfEx;

public class FifthEx3 {

    /* 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: */

    public double ex(double e,int n){
        double sum=0,a;
        for (int i=0;i<=n;i++){
            a=1/Math.pow(2,i)+1/Math.pow(3,i);

            if(Math.abs(a)>=e) sum+=a;
        }
        return sum;
    }
}
