package thirdPartOfEx;

public class ThirdEx3 {

    // 3. Найти сумму квадратов первых ста чисел.

    public int ex(){
        int sum=0;
        for(int i=0;i<=100;i++)
            sum+=Math.pow(i,2);
        return sum;
    }
}
