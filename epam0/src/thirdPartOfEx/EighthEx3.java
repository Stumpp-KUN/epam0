package thirdPartOfEx;

import java.util.ArrayList;

public class EighthEx3 {

    //8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    public void ex(int x,int y){
        ArrayList<Integer> f=new ArrayList<>();
        ArrayList<Integer> s=new ArrayList<>();
        int[] finnal=new int[30];
        int j=0,k=0,t=0;
        while(x>0){
            f.add(j,x%10);
            x/=10;
            j++;
        }
        while(y>0){
            s.add(k,y%10);
            y/=10;
            k++;
        }

        for (int i=0;i<f.size();i++)
        for(int l=0;l<s.size();l++)
                if(f.get(i)==s.get(l)) {
                    finnal[t]=f.get(i);
                    ++t;
                }

        for(int i=0;i<finnal.length;i++)                                    //проверка уникальности чисел
            for(int n=i+1;n<finnal.length;n++)
                if(finnal[i]==finnal[n])
                    finnal[i]=0;

        for(int i=0;i<finnal.length;i++)                                    //вывод уникальных чисел
        {
            if(finnal[i]!=0){
                System.out.println(finnal[i]);

            }        }



    }
}
