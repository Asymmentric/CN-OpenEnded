import java.util.Scanner;

public class CaeserCipher{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Message:");
        String msg=scan.nextLine();
        System.out.println("Enter shift value:");
        int shift = scan.nextInt();
        String encMsg=encrypt(msg,shift);
        System.out.println("Encrypted message :"+encMsg);
        String decMsg=decrypt(encMsg,shift);
        System.out.println("Decrypted message :",decMsg)

    }
    public static String encrypt(String message, int shift) {
    char[] chars = message.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (c >= 'a' && c <= 'z') {
        c = (char)('a' + (c - 'a' + shift) % 26);
      } else if (c >= 'A' && c <= 'Z') {
        c = (char)('A' + (c - 'A' + shift) % 26);
      }
      chars[i] = c;
    }
    return new String(chars);
  }

  public static String decrypt(String message, int shift) {
    return encrypt(message, 26 - shift);
  }
}