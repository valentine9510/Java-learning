package Classes;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getModel(){
        return this.model;
    }
    public String getColour() {
        return colour;
    }
    public String getEngine() {
        return engine;
    }
    public int getDoors() {
        return doors;
    }
    public int getWheels() {
        return wheels;
    }
}
