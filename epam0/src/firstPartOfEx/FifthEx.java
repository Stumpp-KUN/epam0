package firstPartOfEx;

public class FifthEx {

    /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc. */

    public String ex(int T){
        int h=0;
        int m=0;
        if(T<60){
            return T+"s";
        }
        while (T>=60){
            ++m;
            T-=60;
        }
        if(m>=60){
            while(m>=60){
                ++h;
                m-=60;
            }
            return h+"h "+m+"min "+T+"s.";
        }
        else{
            return m+"min "+T+"s";
        }

    }
}
