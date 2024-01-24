package example.com.training;

/*
    Base Abstract class for all trainings.
 */
public abstract class AbstractTraining {

    //Input fields
    private final int averageHeartRatePerWorkout, trainingTime, personWeight;
    //Kilocalories - field which is initialized in constructor and is calculated by formula in calculateCalories() method.
    private final double kilocalories;

    //Constructor which takes 3 main parameters that are used in calculateCalories() formula.
    //At the start validates all input values
    public AbstractTraining(int averageHeartRatePerWorkout, int trainingTime, int personWeight) {
        validateInputValues(averageHeartRatePerWorkout, trainingTime, personWeight);
        this.averageHeartRatePerWorkout = averageHeartRatePerWorkout;
        this.trainingTime = trainingTime;
        this.personWeight = personWeight;
        kilocalories = calculateCalories();
    }

    //Method to validate input values
    public void validateInputValues(int averageHeartRatePerWorkout, int trainingTime, int personWeight){
        if(averageHeartRatePerWorkout < 0 || averageHeartRatePerWorkout >= 500){
            throw new IllegalArgumentException("Heart rate can`t be less than zero or more than 500." +
                    "Exception for heartRate = " + averageHeartRatePerWorkout);
        }
        if(trainingTime < 0){
            throw new IllegalArgumentException("Time can`t be less than zero minutes. Exception for time = " + trainingTime);
        }

        if(personWeight < 0 || personWeight > 700){
            throw new IllegalArgumentException("Person`s Weight can`t be less than zero or more than 700 kg. " +
                    "Exception for person weight = " + personWeight);
        }
    }

    //Method to calculate kilocalories by formula
    public double calculateCalories(){
        return 0.014 * personWeight * trainingTime * (0.12 * averageHeartRatePerWorkout - 7);
    }

    //Method to print fields to console. Child classes must implement it.
    @Override
    public abstract String toString();

    //Helper method for toString() it adds className at start,
    //and adds additional String after personWeight and before kilocalories.
    public String stringHelper(String className, String additionalString){
        return className + "! " +
                "Duration: " + trainingTime + " minutes. " +
                "Averate heart rate: " + averageHeartRatePerWorkout + " heart beats." +
                " Person Weight: " + personWeight + " kg. " +
                additionalString + " Kilocalories: " + kilocalories + " kcal.";
    }
}
