import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Sample {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("引数の個数が不正です。");
      System.exit(1);
    }

    int last = Integer.valueOf(args[args.length - 1]);

    TreeMap<Integer, String> table = new TreeMap<>();
    Pattern p = Pattern.compile("(\\d+):(.+)");

    for (int i = 0; i < args.length - 1; i++) {
      Matcher m = p.matcher(args[i]);
      m.find();
      try {
        table.put(Integer.parseInt(m.group(1)), m.group(2));
      } catch (IllegalStateException e) {
        System.out.println("引数のフォーマットが不正です: " + args[i]);
        System.exit(1);
      }
    }

    table.entrySet().removeIf(entries -> last % entries.getKey() != 0);
 
    for (int key : table.keySet()) System.out.print(table.get(key) + " ");

    System.out.println();
  }
}
