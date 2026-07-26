public class City {
    private String name;
    private Attraction[] attraction;
 
    public City(String name, Attraction[] attraction) {
        this.name = name;
        this.attraction = attraction;
    }
 
    public String getName() {
        return name;
    }
 
    public Attraction[] getAttraction() {
        return attraction;
    }
}