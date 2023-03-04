import java.util.Random;
import java.util.Scanner;

public class RandomPassGenerate {
    private static char randomChar() {
        int rand = new Random().nextInt(52);
        char start = (rand < 26) ? 'A' : 'a';
        return (char) (start + rand % 26);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String pass = "";
        for(int i=0;i<size;i++){
            char x = randomChar();
            System.out.print(x);
        }
    }
}
