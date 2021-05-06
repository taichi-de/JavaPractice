import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {

  public static void main(String[] args) {
    System.out.println("Enter your question");

    Scanner scan = new Scanner(System.in);
    scan.next();
    scan.close();

    Random rand = new Random();
    int r = rand.nextInt(5);

    switch(r){
      case 1:
        System.out.println(r + ": As I see it, yes.");
        break;
      case 2:
        System.out.println(r + ": Good job, man");
        break;
      case 3:
        System.out.println(r + ": booooooooo!");
        break;
      case 4:
        System.out.println(r + ": Summer is the best season.");
        break;
      case 5:
        System.out.println(r + ": Retry it!");
        break;
    }
  }
}
