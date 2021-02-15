package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private String companySuffix = "aeycompany.com";
    private int defaultPasswordLenght = 10;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    Scanner input = new Scanner(System.in);

    //Constructor to receive the first name and last name
    public Email(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
       // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
       // System.out.println("Department: "+this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your password is " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+"." + companySuffix;
       // System.out.println("Your email is: " + email);
    }
   //Ask for the department
    private String setDepartment() {
        System.out.println("New worker:" +firstName+ ". Department Codes: \n1 For Sales\n2 For Development \n3 For Accounting\n");
        int depChoice = input.nextInt();
        if (depChoice == 1) {
            return "sales";
        }
        else if (depChoice == 2) {
            return "dev";
        }
        else if (depChoice == 3) {
            return "acct";
        }
        else {return "";}
    }

    //Generate a random password
    private String randomPassword(int lenght){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[lenght];
        for (int i = 0;i<lenght;i++){
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
        }

        return new String(password);


        //Math.random(); =>It return between 0.0 and 1.0
    }
    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\nDISPLAY NAME:" + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " +email +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";

    }

}
