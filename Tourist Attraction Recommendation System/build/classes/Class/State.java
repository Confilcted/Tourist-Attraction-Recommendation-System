public enum State {

    PLACEHOLDER("Placeholder State", new City[0]);
 
    private final String name;
    private City[] city;
 
    State(String name, City[] city) {
        this.name = name;
        this.city = city;
    }
 
    public String getName() {
        return name;
    }
 
    public City[] getCity() {
        return city;
    }
 
    public void setCity(City[] city) {
        this.city = city;
    }
}
