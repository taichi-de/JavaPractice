public class EnumIsFun {
  enum Flavor {
    CHOCOLATE, VANILLA, STRAWBERRY;
  }

  public static void main(String[] args) {
    Flavor flav = Flavor.STRAWBERRY;

    if(flav == flav.VANILLA){
      System.out.println("it's vanilla!");
    }else if(flav == flav.CHOCOLATE){
      System.out.println("it's chocolate!");
    }else if(flav == flav.STRAWBERRY){
      System.out.println("it's strawberry!");
    }
  }
}
