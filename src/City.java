/**
 * Created by petya on 2017.05.30..
 */
public class City extends Location{

    private String name;

    public City(String name, int x, int y){
        super(x,y);
        this.name = name;
    }

    public Position setPosition(){
        return this.position;
    }
}
