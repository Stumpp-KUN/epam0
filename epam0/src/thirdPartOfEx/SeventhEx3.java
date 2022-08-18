package thirdPartOfEx;

public class SeventhEx3 {

    /*  7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры. */

    public void ex(int m,int n){
        for(int i=m;i<=n;i++){
            System.out.print("Deliteli "+i+": ");
            for(int j=2;j<=n;j++){
                if(i%j==0&&j!=i){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
