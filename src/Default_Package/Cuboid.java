package Default_Package;

public class Cuboid {
    // Instance variables to store width, height, and depth of the cuboid
    int width;
    int height;
    int depth;

    // Constructor 1: Takes all three dimensions as parameters
    // 'this' keyword refers to the current object's instance variables
    Cuboid(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor 2: Takes width and height, sets default depth to 10
    Cuboid(int width, int height) {
        this.width = width;
        this.height = height;
        this.depth = 10; // default depth value
    }

    // Constructor 3: Takes one dimension for creating a cube (all sides equal)
    Cuboid(int dimension) {
        width = dimension;
        height = dimension;
        depth = dimension;
    }

    // Constructor 4: No-argument constructor that sets all dimensions to 10
    Cuboid() {
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    // Method to calculate the volume of the cuboid
    int volume() {
        // Volume formula: width × height × depth
        return width * height * depth;
    }

    public static void main(String[] arg) {
        int volume;

        // Create a Cuboid object with all dimensions specified
        Cuboid stdCuboid = new Cuboid(10, 20, 15);
        volume = stdCuboid.volume();
        System.out.println("volume of a simple cuboid is: " + volume);

        // Create a Cuboid object specifying width and height only (depth defaults to 10)
        Cuboid cuboidwithDefault = new Cuboid(10, 20);
        volume = cuboidwithDefault.volume();
        System.out.println("volume of cuboid with default depth is: " + volume);

        // Create a cube where all sides are equal
        Cuboid cube = new Cuboid(10);
        volume = cube.volume();
        System.out.println("volume of cube is: " + volume);

        // Create a cuboid with default dimensions all set to 10
        Cuboid defaultCuboid = new Cuboid();
        volume = defaultCuboid.volume();
        System.out.println("volume of defaultCuboid is: " + volume);
    }
}