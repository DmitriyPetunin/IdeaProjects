package ru.itis.inf304.kontrolWork1;

public class CallTheElevator implements ElevatorCall {
    private ElevatorChet currentChet;
    private ElevatorNechet currentNeChet;
    private ElevatorForEmployee currentForEmployee;

    public Elevator callTheElevator(ElevatorType elev) {
        if (elev == ElevatorType.сотрудник) {
            return checkFreeElevatorsForEmpl();
        }
        if (elev == ElevatorType.чётные) {
            return checkFreeEvenElevators();
        }
        if (elev == ElevatorType.нечётные) {
            return checkFreeOddElevators();
        }
        return null;
    }
    public ElevatorForEmployee checkFreeElevatorsForEmpl() throws InvalidNoEmptyElevators{
        if (currentForEmployee.getStatus() == ElevatorStatus.свободен){
            return currentForEmployee;
        }
        throw new InvalidNoEmptyElevators();
    }
    public ElevatorChet checkFreeEvenElevators() throws InvalidNoEmptyElevators{
        if (currentForEmployee.getStatus() == ElevatorStatus.свободен){
            return currentChet;
        }
        throw new InvalidNoEmptyElevators();
    }
    public ElevatorNechet checkFreeOddElevators(){
        if (currentForEmployee.getStatus() == ElevatorStatus.свободен){
            return currentNeChet;
        }
        throw new InvalidNoEmptyElevators();
    }

    @Override
    public Elevator call() {
        return null;
    }
}
