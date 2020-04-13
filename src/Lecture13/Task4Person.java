package Lecture13;

public class Task4Person {
    String firstName;
    String lastName;
    String middleName;

    Task4Person (String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public void one(){
        String firstNameUpper = firstName.toUpperCase();
        char firstNameCh = firstNameUpper.charAt(0);

        String lastNameUpper = lastName.toUpperCase();
        char lastNameCh = lastNameUpper.charAt(0);

        String middleNameUpper = middleName.toUpperCase();
        char middleNameCh = middleNameUpper.charAt(0);

        System.out.println("Full username is: " + firstName + " " + lastName + " " + middleName);
        System.out.println("Initials: " + firstNameCh + "" + lastNameCh + "" + middleNameCh);
    }

}

class Task4Test{
    public static void main(String[] args) {
        Task4Person john = new Task4Person("john", "abram", "doelde");
        Task4Person berta = new Task4Person("Berta", "Luis", "bernedalt");
        john.one();
        berta.one();

    }
}
