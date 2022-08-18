package firstPartOfEx;

public class SixthEx {

    /* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */

    public boolean ex(int x,int y){
        if(y>0&&y<=4){
            if(x>=-2&&x<=2) return true;
            else return false;
        }
        else if(y<=0&&y>=-3){
            if(x>=-4&&x<=4) return true;
            else return false;
        }
        else return false;
    }
}
