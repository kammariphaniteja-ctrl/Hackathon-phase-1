import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        int bill = (consumption <= 500) ? 100 : 200;

        System.out.println("Water Bill: Rs." + bill);
        sc.close();
    }
}