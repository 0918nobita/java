public class Example {
  public static void main(String[] args) {
    // ピラミッドの高さ
    int height = Integer.parseInt(args[0]);
    // 毎回出力するスペースの個数
    int spaces = height - 1;
    // 毎回出力するアスタリスクの個数
    int asteriskCount = 1;

    for (int asterisks = 1; asterisks <= height; asterisks++) {
      for (int i = 1; i <= spaces; i++) System.out.print(" ");
      for (int i = 1; i <= asteriskCount; i++) System.out.print("*");
      System.out.println("");
      spaces--;
      asteriskCount += 2;
    }
  }
}
