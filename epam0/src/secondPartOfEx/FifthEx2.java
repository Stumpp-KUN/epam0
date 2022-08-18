package secondPartOfEx;

public class FifthEx2 {

    //5. Вычислить значение функции:

    public double ex(int x){
        if(x<=3){
            return Math.pow(x,2)-3*x+9;
        }
        else return 1/(Math.pow(x,3)+6);
    }
}
