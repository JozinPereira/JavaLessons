public class MainString {
    public MainString() {
    }

    public static void main(String[] args) {
        String str;
        str = " дОБРО ";
        str2(str);
        System.out.println(ok(str));

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

    private static String ok(String str) {

        String strA = str.trim();

        return strA
                .substring(0, 1)
                .toUpperCase()
                .concat(strA
                        .toLowerCase()
                        .substring(1)
                );


    }


}

