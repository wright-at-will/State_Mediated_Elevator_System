package CS4773;

public interface Mediator {
    Floor getFloor();
    void openDoors();
    void closeDoors();
    Floor moveUp(int newFloor);
    Floor moveDown(int newFloor);
}
