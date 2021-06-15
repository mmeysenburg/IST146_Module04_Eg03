import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // password security portion
    Scanner scan = new Scanner(System.in);
    System.out.println("A strong password has at least 8 \n"
                       + "characters and contains at least one digit \n"
                       + "and one special character.");
    System.out.print("Enter a password > ");
    String password = scan.next();

    PasswordSecurityHandler psh = new PasswordSecurityHandler();
    psh.parse(password);

    System.out.println(password + "'s security is " + psh.securityLevel());

    // hexadecimal parsing portion
    System.out.print("Enter a hexadecimal number > ");
    String hex = scan.next();

    HexStringHandler hsh = new HexStringHandler();
    hsh.parse(hex);

    if (hsh.isValid())
      System.out.println(hex + " = " + hsh.getNumber());
    else
      System.out.println(hex + " is not a valid hex number.");
  }
}