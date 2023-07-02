/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static int sumAandB(int x, int y) {
    int a;
    Calculate calculate = new Calculate();
    a = calculate.sum(x, y);

    return a;
  }

  public static int sumAtoB(int x, int y) {
    int a = 0;
    Calculate calculate = new Calculate();

    for (int i = 1; i <= 10; i++) {
      a = calculate.sum(a, i);
    }
    return a;
  }

  public static int[] sumOddandEven(int x, int y) {
    int[] a = { 0, 0 };
    Calculate calculate = new Calculate();
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 1)
        a[0] = calculate.sum(a[0], i);
      else
        a[1] = calculate.sum(a[1], i);
    }

    return a;

  }

  public static void main(String[] args) {
    int x, y;
    int a, b, c[];
    System.out.println(new App().getGreeting());

    a = sumAandB(x = 2, y = 3);

    System.out.print("Sum of " + x + " and " + y + " is " + a + ".");
    System.out.println("Average is " + (double) a / 2 + ".");

    b = sumAtoB(x = 1, y = 10);

    System.out.print("Sum of " + x + " to " + y + " is " + b + ".");
    System.out.println("Average is " + (double) b / y + ".");

    c = sumOddandEven(x = 1, x = 10);

    System.out.print("Sum of odd of " + x + " to " + y + " is " + c[0] + ".");
    System.out.println("Sum of even is " + c[1] + ".");

  }
}
