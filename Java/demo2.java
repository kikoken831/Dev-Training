public class demo2 {
    public static void main(String[] args) {
        String s1 = "Ken";
        String s2 = "test";
        String s3 = "Ken";

        s1.concat(s2);
        s1 = s1 + "Happy";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1==s3);
    }
}
