/**
 * Created by petya on 2017.05.30..
 */
public class Position {
    protected int x;
    protected int y;

    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x:" + x + "y:" + y;
    }
}
