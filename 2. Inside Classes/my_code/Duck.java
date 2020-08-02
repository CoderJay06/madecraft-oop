public class Duck {

    // member vars: data (encapsulated / private)
    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    public Duck(String name, int lifeExpectancy, String favoriteFood) {
        super();
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }

    // methods: functionality
    void waddle() {
        lifeExpectancy++;
        System.out.println(this.name + " waddles");
    }


    void quack() {
        System.out.println("quack quack");
    }

    @Override 
    public String toString() {
        return this.name + this.favoriteFood;
    }
}