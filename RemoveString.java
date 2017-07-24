public class test {

    public static void main(String[] args) {

        String a = new String("Anitha");
        String b = new String();

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) != b.charAt(j)) {
                    b = b + a.charAt(i);
                }
            }
        }

        System.out.println(b);

    }

}
