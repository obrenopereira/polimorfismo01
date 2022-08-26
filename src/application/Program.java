package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the numbers of employees: ");
        int n = read.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Employee #" + i + " data: ");
            char ch = read.next().charAt(0);
            System.out.print("Name: ");
            read.nextLine();
            String name = read.nextLine();
            System.out.print("Hours: ");
            int hours = read.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = read.nextDouble();

            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = read.nextDouble();
                list.add(new OutSourcedEmployee(name, hours, valuePerHour,additionalCharge));
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
            }

            System.out.println();
            System.out.println("PAYMENT");
            for (Employee emp : list){
                System.out.println(emp.getName() + " - $ " + emp.payment() + String.format("%.2f", emp.payment()));
            }

        }







        read.close();

    }

}
