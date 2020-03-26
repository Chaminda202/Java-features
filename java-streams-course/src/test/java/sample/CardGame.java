package sample;

public class CardGame {
    public static void main(String[] args){
        System.out.println(alecWiningTurns("A586QK", "JJ653K"));
        System.out.println(alecWiningTurns("23A84Q", "K2Q25J"));
    }

    public static int alecWiningTurns(String A, String B){
        char [] alec = A.toCharArray();
        char [] bob = B.toCharArray();

        int winingCount = 0;

        for(int i=0;i< alec.length;i++){
            if(cardValue(alec[i]) > cardValue(bob[i])){
                winingCount++;
            }
        }
        return winingCount;
    }

    public static int cardValue(char val){
        switch (val) {
            case 'K':
                return 15;
            case 'Q':
                return 14;
            case 'A':
                return 13;
            case 'J':
                return 12;
            case 'T':
                return 10;
            default:
                return Integer.parseInt(Character.toString(val));
        }
    }
}
