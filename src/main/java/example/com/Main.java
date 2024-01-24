package example.com;

import example.com.training.AbstractTraining;
import example.com.training.BoxTraining;
import example.com.training.CrossfitTraining;
import example.com.training.RunningTraining;

//Class Main which contains the starting point of my application
public class Main {
    /*
        main() method is the starting point of my application.
        It creates an array trainings of AbstractTraining objects with a length of 9.
        Then main() starts for loop that iterates from the first to the last index in trainings.
        It creates a temp variable which is initialized as temp = i + 1, it is used to decide which type of training
        should be created and added to trainings array.
        If the temp is divided by 3 without a remainder then CrossfitTraining is created.
        If the temp is divided by 2 without a remainder then RunningTraining is created.
        If the temp can`t be divided by 3 or 2 without a remainder than it creates BoxTraining.
        The method prints the object that has been created.
     */
    public static void main(String[] args) {
        AbstractTraining[] trainings = new AbstractTraining[9];

        for(int i = 0; i < trainings.length; i++){
            int temp = i + 1;
            if(temp % 3 == 0){
                trainings[i] = new CrossfitTraining((temp+1) * 40, temp * 10,
                        temp * 10, i * 20);
            } else if(temp % 2 == 0){
                trainings[i] = new RunningTraining((temp+1) * 40, temp * 10,
                        temp * 10, temp * 4);
            } else {
                trainings[i] = new BoxTraining((temp+1) * 40, temp * 10, temp * 10);
            }
            System.out.println(trainings[i]);
        }
    }
}