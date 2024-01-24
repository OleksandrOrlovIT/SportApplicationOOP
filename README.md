# SportApplicationOOP
I created an application to test my OOP skills.<br>
The main goal of an application is to implement some fitness tracker methods. I had to create 3 training classes Box, Crossfit and Running training.<br>
Because all of these classes have a lot in common and I don`t need to create an object of a base training, I created an Abstract class as their parent.
![image](https://github.com/OleksandrOrlovIT/SportApplicationOOP/assets/86959421/57b20005-9d3f-425b-9faa-9a5f75c49f65)

This AbstractTraining class has an abstract method toString(), to make children implement it, additionally  I created a stringHelper() method to get rid of repeating code.
![image](https://github.com/OleksandrOrlovIT/SportApplicationOOP/assets/86959421/3a4d6e7d-78ba-41d6-b3e8-a098f5f3d127)

Using inheritance I had to add only additional code, for example distance field and validateAdditionalFields() method for the RunningTraining class.
All other fields and methods that are required for the class are placed in AbstractTraining.java.
![image](https://github.com/OleksandrOrlovIT/SportApplicationOOP/assets/86959421/1f2599e9-05ec-4cc3-bb1e-74516acc3d31)

Other training classes are implemented in the same way as RunningTraining.java.
For incapsulation, child classes can`t change the private fields of their parent after initializing them in the constructor. 
For polymorphism my classes have the same method name toString(), but this method works differently for each training.
To show polymorphism and my application in action, I created the main method which will create trainings and print them to the console.
![image](https://github.com/OleksandrOrlovIT/SportApplicationOOP/assets/86959421/ef439375-f647-4d32-af59-285163b5dcc8)

![image](https://github.com/OleksandrOrlovIT/SportApplicationOOP/assets/86959421/f54111b8-5284-4126-808d-dad2ad169467)
