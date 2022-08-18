package secondPartOfEx;

public class SecondEx2 {

    //2. Найти max{min(a, b), min(c, d)}.

    public int ex(int a,int b,int c,int d){
        int min1,min2;

        if(a<b) min1=a;
        else min1=b;

        if (c<d) min2=c;
        else min2=d;

        if(min1<min2) return min2;
        else return min1;
    }
}
