package secondPartOfEx;

public class ThirdEx2 {

    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public boolean ex(int x1,int x2,int x3,int y1, int y2, int y3){
        if((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)){
            return true;
        }
        else return false;
    }
}
