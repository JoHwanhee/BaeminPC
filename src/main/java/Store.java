import java.util.ArrayList;

public class Store {
    private ArrayList<String> comments;

    private int starSum;
    private double starAverage;
    private double distance;

    private int starCount;

    private String id;
    private String name;


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Store(String id, String name){
        this.id = id;
        this.name = name;

        comments = new ArrayList<String>();
        starSum = 0;
        starAverage = 0.0d;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    private void evaluate(){
        starAverage = starSum / starCount;
    }

    public void add(int star){
        starSum += star;
        starCount += 1;
    }


    public void add(String comment){

    }

    public String[] getComments(){
        return comments.toArray(new String[comments.size()]);
    }

    public double getStarAverage(){
        evaluate();
        return starAverage;
    }
}
