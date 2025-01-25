import java.util.Scanner;

public class Demo021 {

    public static double calculateTax(double taxableIncome) {
        double tax = 0.0;

        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20);
        } else {
            tax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30);
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter monthly PF: ");
        double pf = scanner.nextDouble();

        double annualSalary = monthlySalary * 12; // annual salary

        double annualHRA = hra * 12; // avg of both hra and anualPf acc.to the year :: monthly * 12 broo
        double annualPF = pf * 12;
        double deductions = annualHRA + annualPF;

        double taxableIncome = annualSalary - deductions; // it is taken after all deductions broo

        double tax = calculateTax(taxableIncome);

        System.out.println("Annual Gross Salary: " + annualSalary);
        System.out.println("Annual Deductions (HRA + PF): " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Annual Income Tax: " + tax);

        scanner.close();
    }

}
