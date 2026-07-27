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

    public void setName (String name) {
        this.name = name;
    }
    
    public Attraction[] getAttraction() {
        return attraction;
    }
    
    public void setAttractions(Attraction[] attractions) {
        this.attraction = attraction;
    }
    @Override
    public String toString{
        return name;
    }
}
