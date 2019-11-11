package CS4773;

public class Elevator {
    Mediator mediator;
    Floor floor;
    Elevator(){
        mediator = new ConcreteMediator();
        floor = mediator.getFloor();
    }
    void press1(){
        System.out.println("1 pressed");
        mediator.closeDoors();
        floor = floor.button1();
        //mediator.mediate(1);
    }

    void press2(){
        System.out.println("2 pressed");
        mediator.closeDoors();
        floor = floor.button2();
        //mediator.mediate(2);
    }

    void press3(){
        System.out.println("3 pressed");
        mediator.closeDoors();
        floor = floor.button3();
        //mediator.mediate(3);
    }
}
