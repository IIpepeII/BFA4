
public class Main {

    public static String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        User user =  User.getInstance();
        user.setActualLocation(1,4);
        user.setActualLocation(3,5);
        user.setActualLocation(4,3);
        user.setActualLocation(2,1);
        System.out.println(user.getLocationHistory());

        City budapest = new City("Budapest",1,4);
        System.out.println(budapest.position);

    }
}
