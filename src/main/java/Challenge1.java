public class Challenge1 {
    public static void main(String[] args) {
        String text1 = "oxcpqrsvwf";
        String text2 = "shmtulqrypy";

        int count = 0;
        int index2 = 0;
        for (int i = 0; i < text1.length(); i++) {
            char current1 = text1.charAt(i);
            for (int j = index2; j < text2.length(); j++) {
                if (current1 == text2.charAt(j)) {
                    System.out.println(current1);
                    count ++;
                    index2 = j + 1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
