package ru.itis.inf304.kontrolWork1;

public class Main {
    public static void main(String[] args) {
        Elevator elevatorch1 = new ElevatorChet();
        Elevator elevatorch2 = new ElevatorChet();
        Elevator elevatorch3 = new ElevatorChet();

        Elevator elevatornechet1 = new ElevatorNechet();
        Elevator elevatornechet2 = new ElevatorNechet();
        Elevator elevatornechet3 = new ElevatorNechet();

        Elevator elevatorforemployee = new ElevatorForEmployee();

//        CallTheElevator call = new CallTheElevator(evenFloors, oddFloors, employerEl);
//        try {
//            Elevator el = call.callTheElevator(ElevatorStatus.занят);
//            System.out.println(el);
//        }
//        catch (InvalidNoEmptyElevators e){
//            System.out.println("Нет пустых лифтов");
//        }

    }
}
