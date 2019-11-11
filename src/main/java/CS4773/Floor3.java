package CS4773;

public class Floor3 extends Floor {
    Floor3(Mediator mediator){
        super(mediator);
    }

    @Override
    Floor button1() {
        return mediator.moveDown(1).getState();
    }

    @Override
    Floor button2() {
        return mediator.moveDown(2).getState();
    }

    @Override
    Floor button3() {
        System.out.println("Nothing happens");
        return this;
    }

    @Override
    public void moveFloor() {

    }

    @Override
    public Floor getState() {
        System.out.println("*ding* The elevator arrives at Floor 3");
        mediator.openDoors();
        return this;
    }
}
