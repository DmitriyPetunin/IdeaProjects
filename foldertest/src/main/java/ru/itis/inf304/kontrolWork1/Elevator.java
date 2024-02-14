package ru.itis.inf304.kontrolWork1;

public abstract class Elevator {
    private ElevatorStatus status;
    Elevator(){
        status = ElevatorStatus.свободен;
    }

    public ElevatorStatus getStatus(){
        return status;
    }
    public void setStatus(ElevatorStatus status){
        this.status = status;
    }
}
