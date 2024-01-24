package example.com.training;

//BoxTraining class is a child of AbstractTraining class
public class BoxTraining extends AbstractTraining{

    //Constructor uses super() keyword to use constructor of parent class
    public BoxTraining(int averageHeartRatePerWorkout, int trainingTime, int personWeight) {
        super(averageHeartRatePerWorkout, trainingTime, personWeight);
    }

    //Returns String with all fields and class Name.
    @Override
    public String toString() {
        return super.stringHelper("Box training", "");
    }

}
