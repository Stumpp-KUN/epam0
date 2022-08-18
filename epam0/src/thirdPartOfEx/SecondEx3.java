package thirdPartOfEx;

public class SecondEx3 {

    //2. Вычислить значения функции на отрезке [а,b] c шагом h:

    public void ex(int a,int b,int h){
        int y;
        for(int i=a;i<=b;i+=h){
            if(i>2)
                y=i;
            else
                y=i*(-1);
            System.out.println("при х="+i+" y="+y);
        }
    }

}
