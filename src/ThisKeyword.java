public class ThisKeyword {
  String food;
  char size;

  public void setData(String food, char size){
    this.food = food;
    this.size = size;
  }

  public static void main(String[] args) {
    ThisKeyword t = new ThisKeyword();
    t. setData("soup", 'L');
    System.out.println(t.food);
    System.out.println(t.size);
  }
}
