import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amar age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Amar height: ");
        int heightAmar = sc.nextInt();
        System.out.print("Akbar age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Akbar height: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Anthony age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Anthony height: ");
        int heightAnthony = sc.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Youngest: Amar");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (heightAmar > heightAkbar && heightAmar > heightAnthony)
            System.out.println("Tallest: Amar");
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}
