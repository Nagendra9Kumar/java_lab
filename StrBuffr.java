public class StrBuffr {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Nagendraa");
        StringBuffer str2 = new StringBuffer("bonam Bvc");
        StringBuffer str3 = new StringBuffer("bvce");
        System.out.println(str1.deleteCharAt(str1.length() - 1));
        System.out.println(str2.delete(0, 5));
        System.out.println(str3.delete(0, str3.length()));
    }
}
