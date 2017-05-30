import java.util.ArrayList;

public class User extends Location{
    private static User instance = null;

    private ArrayList<Position> locationHistory = new ArrayList<>();

    private User(int x, int y){
        super(x,y);
    }

    public static User getInstance(){

        if(instance == null){
            instance = new User(0,0);
        }

        return instance;
    }

    public void setActualLocation(int x, int y) {
        this.position = new Position(x,y);
        locationHistory.add(this.position);
    }

    public ArrayList<Position> getLocationHistory() {
        return locationHistory;
    }


}
