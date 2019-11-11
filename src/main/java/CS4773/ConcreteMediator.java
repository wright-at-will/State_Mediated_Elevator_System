package CS4773;

public class ConcreteMediator implements Mediator {
    Floor floor;
    Floor[] floors;
    Boolean doorsOpen;
    ConcreteMediator(){
        floors = new Floor[] {new Floor1(this),new Floor2(this),new Floor3(this)};
        floor = floors[0];
        doorsOpen = true;
    }

    public Floor getFloor(){
        return floor;
    }
    //public Floor mediate(Floor floor,int floorPressed) {
    /*    doorsState(true);
        if(floor.getState() == floorPressed) {
            System.out.println("Nothing Happens");
            return floor;
        }
        if(!moveFloors(floorPressed))
        System.out.println("Now on floor "+floor.getState());

        doorsState(false);
    }*/

    @Override
    public void openDoors() {
        if(doorsOpen == false)
            System.out.println("Doors are open");
        doorsOpen = true;
    }

    @Override
    public void closeDoors() {
        if(doorsOpen == true){
            System.out.println("Doors are closed");
        }
        doorsOpen = false;
    }

    public Floor moveUp(int newFloor){
        System.out.println("Going up...");

        return floors[newFloor-1];
    }

    public Floor moveDown(int newFloor){
        System.out.println("Going down...");

        return floors[newFloor-1];
    }

}
