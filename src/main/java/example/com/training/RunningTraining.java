package example.com.training;

//RunningTraining class is a child of AbstractTraining class
public class RunningTraining extends AbstractTraining{

    //Field to store distance of training
    private final int distance;

    //Constructor invokes parent constructor, then validates additional field and initialize it
    public RunningTraining(int averageHeartRatePerWorkout, int trainingTime, int personWeight, int distance) {
        super(averageHeartRatePerWorkout, trainingTime, personWeight);
        validateAdditionalFields(distance);
        this.distance = distance;
    }

    //Overrided method to return String with className and additional field
    @Override
    public String toString() {
        return super.stringHelper("Running Training", "Distance: " + distance + " km.");
    }

    //Method to validate all additional fields
    public void validateAdditionalFields(int distance){
        if(distance < 0){
            throw new IllegalArgumentException("Distance can`t be less than 0. Exception for distance = " + distance);
        }
    }
}
