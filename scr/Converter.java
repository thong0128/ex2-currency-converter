import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD:");
        int usD = scanner.nextInt();
        int vnD = usD * rate;
        System.out.println(usD + " USD quy đổi bằng với " + vnD + " VND");
    }
}
