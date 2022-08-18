package thirdPartOfEx;

public class FourthEx3 {

    //4. Составить программу нахождения произведения квадратов первых двухсот чисел.

    public int ex(){
        int proizv=1;
        for(int i=1;i<=200;i++)
            proizv*=Math.pow(i,2);
        return proizv;
    }


}
