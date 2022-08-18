package firstPartOfEx;

public class FourthEx {
    /*  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.    */

    public double ex(double x){
        return (int)x/1000.0+((x*1000)%1000.0);
    }
}
