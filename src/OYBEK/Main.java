package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// Consolga so`zning oxirgi harfini chiqarish

        Scanner scanner = new Scanner(in);
        System.out.print("So`zni kiriting: ");
        String s = scanner.nextLine();
        System.out.println(s.charAt(s.length()-1));
    }
}
