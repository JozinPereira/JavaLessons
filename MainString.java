public class MainString {
    public MainString() {
    }

    public static void main(String[] args) {
        String str;
        str = " дОБРО ";
        str2(str);

    }

    private static void str2(String str) {
        String str2 = str.trim().toLowerCase();
        System.out.println(str3(str2));

    }

    private static String str3(String str2) {
        String strA = str2.substring(0, 1).toUpperCase();
        String strB = str2.substring(1);

        return strA.concat(strB);
    }


}
