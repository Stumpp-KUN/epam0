package secondPartOfEx;

public class FourthEx2 {

    /*  4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    отверстие. */

    public boolean ex(int a,int b, int x,int y,int z){
        if((x<=a&&y<=b || y<=a&&x<=b || x<=a&&z<=b || z<=a&&x<=b || z<=a&&y<=b || y<=a&&z<=b)){
            return true;
        }
        else return false;
    }

}
