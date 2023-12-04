import com.greatlearning.javasfd.emailapp.model.Employee;
import com.greatlearning.javasfd.emailapp.service.CredentialServiceImpl;
import com.greatlearning.javasfd.emailapp.service.ICredentialService;

import java.util.Scanner;

public class EmployeeApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Email Application");

        System.out.println("Enter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        System.out.println("Enter your department");
        System.out.println("To specify your department, enter the corresponding department number");

        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int departmentCode = input.nextInt();

        ICredentialService credentialService
                = new CredentialServiceImpl();

        Employee employeeObject = new Employee(firstName, lastName);

        String emailAddress = credentialService.generateEmailAddress(
                firstName, lastName, departmentCode);

        // For Email Address
        employeeObject.setEmailAddress(emailAddress);

        // For Password

        String password = credentialService.generatePassword();
        employeeObject.setPassword(password);

        credentialService.displayCredentials(employeeObject);

    }
}