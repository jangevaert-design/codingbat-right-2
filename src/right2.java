public class right2 {
  public String right2(String str) {
    String str1 = str.substring(str.length() - 2, str.length());
    String str2 = str.substring(0, str.length() -2);
    return str1 + str2;
  }
}
