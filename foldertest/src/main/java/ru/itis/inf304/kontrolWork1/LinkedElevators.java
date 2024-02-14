package ru.itis.inf304.kontrolWork1;

public class LinkedElevators implements IElevatorIsFree {
    private Node current;
    private Node root;
    public LinkedElevators(Elevator[] elevs) {
        current = new Node(elevs[0]);
        root = current;
        for (int i = 1; i <= 2;++i){
            current.next = new Node(elevs[i]);
            current = current.next;
        }
        current.next = root;
    }
    public Elevator free() throws InvalidNoEmptyElevators {
        for(int i = 0; i < 3;++i){
            if (current.value.getStatus() == ElevatorStatus.свободен){
                current.value.setStatus(ElevatorStatus.занят);
                current.next.value.setStatus(ElevatorStatus.свободен);
                return current.value;
            }
            next();
        }
        throw new InvalidNoEmptyElevators();
    }
    public  Elevator next(){
        current = current.next;
        return current.value;
    }
}
