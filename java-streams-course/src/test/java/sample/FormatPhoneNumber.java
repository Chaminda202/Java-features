package sample;

public class FormatPhoneNumber {

    public static void main(String[] args){
        System.out.println(solution1("0 - 22 1985- -324"));
    }

    public static String solution(String phoneNumber){
//        String num = phoneNumber.replaceAll("-", "").replaceAll("\\s+", "");
        String num = phoneNumber.replaceAll("\\D", "");
        int subStringLength = 3;
        int countOfOccurrences = num.length() / 3;
        int remainingPartLength = num.length() % 3;
        boolean isChangePattern = false;
        System.out.println(num);
        if(num.length() < 2){
            return "Invalid input, length should be greater than 2";
        }else if(remainingPartLength < 2){
            countOfOccurrences -= 1;
            isChangePattern = true;
        }
        for(int i=0; i< countOfOccurrences; i++){
            StringBuilder str = new StringBuilder();
            num = num.substring(0, subStringLength) + "-" + num.substring(subStringLength);
            subStringLength+= 4;
        }
        System.out.println("Sub string length " + subStringLength);
        if(isChangePattern){
            num = num.substring(0, num.length() - 2) + "-" + num.substring(num.length() - 2);;
        }
        return num;
    }

    public static String solution1(String S) {
        String replaaceAll = S.replaceAll("\\s+", "").replaceAll("-", "");
        int temp = 3;
        int times = replaaceAll.length() / 3;
        int remains = replaaceAll.length() % 3;
        if (remains < 2) times = times - 1;
        for (int i = 0; i < times; i++) {
            replaaceAll = replaaceAll.substring(0, temp) + "-" + replaaceAll.substring(temp, replaaceAll.length());
            temp += 4;
        }
        if (remains == 1) {
            temp -= 1;
            replaaceAll = replaaceAll.substring(0, temp) + "-" + replaaceAll.substring(temp, replaaceAll.length());
        }
        return replaaceAll;
    }
}