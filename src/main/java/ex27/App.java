package ex27;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String fName, lName, zip_code, empID;
        boolean isValid;

        do {
            System.out.print("Enter the first name: ");
            fName = sc.nextLine();
            System.out.print("Enter the last name: ");
            lName = sc.nextLine();
            System.out.print("Enter the ZIP code: ");
            zip_code = sc.nextLine();
            System.out.print("Enter the employee ID: ");
            empID = sc.nextLine();

            isValid = validateInput(fName, lName, zip_code, empID);

        }while (!isValid);

        System.out.println("\nThere were no errors found.");

    }

    public static boolean validateInput(String first, String last, String zip, String id){

        boolean f, l, i, z;
        f = checkname(first);
        l = checklast(last);
        i = checkID(id);
        z = checkzip(zip);

        return f && l && i && z;
    }

    public static boolean checkname(String name){

        if(name.length() == 0)
        {
            System.out.println("First name must be filled in.");
            return false;
        }
        else if(name.length() < 2)
        {
            System.out.println("First name must be at least 2 characters long.");
            return false;
        }

        return true;
    }

    public static boolean checklast(String name){

        if(name.length() == 0)
        {
            System.out.println("Last name must be filled in.");
            return false;
        }
        else if(name.length() < 2)
        {
            System.out.println("Last name must be at least 2 characters long.");
            return false;
        }

        return true;
    }

    public static boolean checkzip(String zip){

        char[] temp = zip.toCharArray();

        if(zip.length() < 5)
        {
            System.out.println("The zipcode must be at least 5 digits.");
            return false;
        }

        for(int i = 0; i < zip.length(); i++)
        {
            if(!Character.isDigit(temp[i]))
            {
                System.out.println("The zipcode must be a 5 digit number.");
                return false;
            }

        }

        return true;
    }

    public static boolean checkID(String id){

        char[] temp = id.toCharArray();
        boolean flag = true;

        for(int i = 0; i < id.length(); i++)
        {
            if(i < 2)//checks first two digits
            {
                if(!Character.isLetter(temp[i]))
                    flag = false;
            }
            else if(i == 2)//checks third digit
            {
                if(Character.isLetter(temp[i]) || Character.isDigit(temp[i]))
                    flag = false;
            }
            else//Rest of ID
            {
                if(!Character.isDigit(temp[i]))
                    flag = false;
            }

            if(!flag)
            {
                System.out.println("The employee ID must be in the format of AA-1234.");
                return flag;
            }

        }


        return flag;
    }
}
