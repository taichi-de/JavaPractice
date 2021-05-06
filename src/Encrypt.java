public class Encrypt {

  public static void main(String[] args) {
    int key = 6;

    String text = "Nu}-y&oz&muotm2&sgzk'";
    System.out.println(text);

    char[] chars = text.toCharArray();

    for(char c : chars) {
      c -= key;
      System.out.print(c);
    }
  }
}
