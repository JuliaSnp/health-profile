

/**
 *
 * @author Julia
 */



public class HealthProfile {



     //instance variables

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;
    private int age;
    private int maxRate;
    private double targetLower;
    private double targetHigher;
    private double bmi;


//constructor
    public HealthProfile() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

//setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


	//calculations

    public int calcAge(){
    age=2017-year;
    return age;
}


public int calcMax(){
    maxRate=220-age;
    return maxRate;
}



public double calcLower(){
    targetLower=maxRate*0.5;
    return targetLower;
}

public double calcHigher(){
   targetHigher=maxRate*0.85;
   return targetHigher;
}

public double calcBmi(){
    bmi=weight/((height/100)*(height/100)); //math.pow giving an error..?
    return bmi;
}


}
