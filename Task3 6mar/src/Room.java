public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;


    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }

    int getNumberOfDoors(){
        return numberOfDoors;
    }

    int getNumberOfLamps(){
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }


    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void SetNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }


    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}

