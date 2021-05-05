import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

  public static void main(String[] args) {

    LocalDate today = LocalDate.now();
    LocalDate birthDate = LocalDate.of(1996,8,24);
    int years = Period.between(birthDate, today).getYears();

    System.out.println("today is " + today);
    System.out.println("and your birthday is " + birthDate);
    System.out.println("So you must be.. " + years + " years old!, right??");
  }
}
