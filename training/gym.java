package training;

import java.util.Scanner;

public class gym {
    private String name;
    private int numberOfMembers;
    private int monthlyFeeRate;
    private int monthlyExpenseRate;

    // Constructor
    public gym(String name, int numberOfMembers, int monthlyFeeRate, int monthlyExpenseRate) {
        this.name = name;
        this.numberOfMembers = numberOfMembers;
        this.monthlyFeeRate = monthlyFeeRate;
        this.monthlyExpenseRate = monthlyExpenseRate;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public int getMonthlyFeeRate() {
        return monthlyFeeRate;
    }

    public void setMonthlyFeeRate(int monthlyFeeRate) {
        this.monthlyFeeRate = monthlyFeeRate;
    }

    public int getMonthlyExpenseRate() {
        return monthlyExpenseRate;
    }

    public void setMonthlyExpenseRate(int monthlyExpenseRate) {
        this.monthlyExpenseRate = monthlyExpenseRate;
    }

    public int calculateMonthlyIncome() {
        return (monthlyFeeRate * numberOfMembers) - monthlyExpenseRate;
    }

    @Override
    public String toString() {
        return "Gym Name: " + name + ", Monthly Income: RM" + calculateMonthlyIncome() ;
    }

    public static void main(String[] args) {
        // gym gym1 = new gym("Sepang Fitness", 100, 50, 2000);
        // gym gym2 = new gym("FitZone", 80, 55, 1800);
        // gym gym3 = new gym("MuscleUp", 120, 60, 2200);
        // gym gym4 = new gym("Iron Gym", 90, 65, 1900);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of gyms: ");
        int n = scan.nextInt();
        scan.nextLine();

        gym[] gyms = new gym[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for gym #" + (i + 1));
            System.out.print("Enter gym name: ");
            String name = scan.nextLine();
            System.out.print("Enter number of members: RM");
            int numberOfMembers = scan.nextInt();
            System.out.print("Enter monthly fee rate: RM");
            int monthlyFeeRate = scan.nextInt();
            System.out.print("Enter monthly expense rate: RM");
            int monthlyExpenseRate = scan.nextInt();
            scan.nextLine();

            gyms[i] = new gym(name, numberOfMembers, monthlyFeeRate, monthlyExpenseRate);
        }

        for (gym g : gyms) {
            System.out.println("\n" + g.toString() + "\n");
        }

        scan.close();
    }
}
