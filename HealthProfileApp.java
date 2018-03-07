

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class HealthProfileApp {

    
     
    public static void main(String[] args) {

    String firstName;
    String lastName;
    String gender;
    int day;
    int month;
    int year;
    double height;
    double weight;
    int age;
    int maxRate;
    double targetLower;
    double targetHigher;
    double bmi;

    Scanner input=new Scanner(System.in);
    HealthProfile myHealthProfile=new HealthProfile();

    System.out.println("First name");
    firstName=input.nextLine();
    System.out.println("Last name");
    lastName=input.nextLine();
    System.out.println("Gender");
    gender=input.nextLine();
    System.out.println("Day of birth");
    day=input.nextInt();
    System.out.println("Month of birth");
    month=input.nextInt();
    System.out.println("Year of birth");
    year=input.nextInt();
    System.out.println("Height in cm");
    height=input.nextDouble();
    System.out.println("Weight in kg");
    weight=input.nextDouble();

    myHealthProfile.setWeight(weight);
    myHealthProfile.setYear(year);
    myHealthProfile.setHeight(height);


        age=myHealthProfile.calcAge();
        maxRate=myHealthProfile.calcMax();
        targetLower=myHealthProfile.calcLower();
        targetHigher=myHealthProfile.calcHigher();
        bmi=myHealthProfile.calcBmi();

        System.out.println("Summary:\nName: "+firstName+" "+lastName+"\nGender: "+ gender+"\nDate of Birth: "+day+"."+month+"."+year+".\nHeight: "+height+" cm\nWeight: "+weight+" kg");
        System.out.println("Dear "+firstName+" "+lastName+ " as your age is "+age+" your maximum heart rate should be "+maxRate+" and BMI is "+bmi+".\n Please note the normal heart rate range is between "+targetLower+ " and "+targetHigher+". Thank you for using our application.");
        System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.8 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater");




    }
}
