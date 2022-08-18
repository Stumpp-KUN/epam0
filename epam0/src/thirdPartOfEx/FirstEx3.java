package thirdPartOfEx;

public class FirstEx3 {

    /*  1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.   */

    public int ex(int x){
        int j=0;
        for(int i=1;i<=x;i++)
            j+=i;
        return j;

    }
}
