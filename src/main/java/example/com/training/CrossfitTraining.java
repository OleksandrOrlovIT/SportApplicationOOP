package example.com.training;

//CrossfitTraining class is a child of AbstractTraining class
public class CrossfitTraining extends AbstractTraining{

    //Field to store weight of average equipment weight
    private final int averageEquipmentWeight;

    //Constructor invokes parent constructor, then validates additional field and initialize it
    public CrossfitTraining(int averageHeartRatePerWorkout, int trainingTime, int personWeight, int averageEquipmentWeight) {
        super(averageHeartRatePerWorkout, trainingTime, personWeight);
        validateAdditionalFields(averageEquipmentWeight);
        this.averageEquipmentWeight = averageEquipmentWeight;
    }

    //Overrided method to return String with className and additional field
    @Override
    public String toString() {
        return super.stringHelper("Crossfit Training",
                "Average equipment weight: " + averageEquipmentWeight + " kg.");
    }

    //Method to validate all additional fields
    public void validateAdditionalFields(int averageEquipmentWeight){
        if(averageEquipmentWeight < 0 || averageEquipmentWeight > 200){
            throw new IllegalArgumentException("Average equipment weight can`t be less than 0 or more than 200." +
                    " Exception for average equipment weight= " + averageEquipmentWeight);
        }
    }
}
