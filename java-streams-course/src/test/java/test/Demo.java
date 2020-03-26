package test;

public class Demo {
    public static void main(String[] args) {
        //solution("123456");
        System.out.println(solution(123456));
    }

    public static void solution(String s) {
        StringBuffer st = new StringBuffer();

        for (int i = 0; i < s.length() / 2; i++) {
            st.append(s.charAt(i));
            st.append(s.charAt(s.length() - 1 - i)); // appending characters from last
        }
        if (s.length() % 2 != 0) {
            st.append(s.charAt(s.length() / 2));
        }
        System.out.println(Integer.parseInt(st.toString()));
    }

    public static int algorithm(int A) {
        StringBuilder shuffleStr = new StringBuilder();
        char[] charArr = String.valueOf(1234).toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i % 2 == 0)
                shuffleStr.append(charArr[i / 2]);
            else
                shuffleStr.append(charArr[charArr.length - i / 2 - 1]);
        }
        return Integer.parseInt(charArr.toString());
    }

    public static int solution(int A) {
        StringBuilder shuffleStr = new StringBuilder();
        char[] charArr = Integer.toString(A).toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i % 2 == 0)
                shuffleStr.append(charArr[i / 2]);
            else
                shuffleStr.append(charArr[charArr.length - i / 2 - 1]);
        }
        return Integer.parseInt(shuffleStr.toString());
    }
}
