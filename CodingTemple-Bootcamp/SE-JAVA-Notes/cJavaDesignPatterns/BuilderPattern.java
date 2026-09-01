package cJavaDesignPatterns;
//This code utilizes the Builder Pattern by separating the construction logic of the House object into a nested HouseBuilder class.
//Required fields (foundation and structure) are passed to the HouseBuilder constructor.
//Optional fields (hasGarden and hasGarage) are set using builder methods (setGarden(), setGarage()), which return the builder object itself, allowing for method chaining.
//Finally, the build() method constructs the House object with the specified values by passing the builder instance to the House constructor.
// This ensures the House object is only created when the builder is complete, keeping the construction process flexible and readable.
class House {
    // Required parameters
    private String foundation;
    private String structure;

    // Optional parameters
    private boolean hasGarden;
    private boolean hasGarage;

    // Private constructor so that the object is built using the builder
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
    }

    // Getters for the fields
    public String getFoundation() { return foundation; }
    public String getStructure() { return structure; }
    public boolean hasGarden() { return hasGarden; }
    public boolean hasGarage() { return hasGarage; }

    // Static Builder Class
    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private boolean hasGarden;
        private boolean hasGarage;

        // Builder constructor with required fields
        public HouseBuilder(String foundation, String structure) {
            this.foundation = foundation;
            this.structure = structure;
        }

        // Methods to set optional fields, returning the builder for chaining
        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        // Build method to create a House instance
        public House build() {
            return new House(this);
        }
    }

}
public class BuilderPattern {
    public static void main(String[] args) {
        // Building a house with required and optional parameters
        House house = new House.HouseBuilder("Concrete", "Wood")
                .setGarden(true)
                .setGarage(false)
                .build();

        System.out.println("House built with foundation: " + house.getFoundation());
        System.out.println("Has garden: " + house.hasGarden()); // true
        System.out.println("Has garage: " + house.hasGarage()); // false
    }
}
