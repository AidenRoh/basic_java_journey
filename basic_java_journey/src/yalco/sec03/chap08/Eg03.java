package yalco.sec03.chap08;

public class Eg03 {
    public static void main(String[] args) {
        //  이중 배열
        boolean[][] dblBoolAry = new boolean[3][3];

        int[][] dblIntAry = new int[][] {
                //  ⭐️ 요소 배열의 크기가 다를 수 있음 -- why? {1,2,3} 의 주소값을 담고 있기 때문임 즉 dbIntAry[0]에 {1,2,3} 의 주소값이 저장
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

        //  삼중 배열
        char[][][] trpChrAry = {
                {{'자', '축'}, {'인', '묘'}},
                {{'진', '사'}, {'오', '미'}},
                {{'신', '유'}, {'술', '해'}},
        };


        int int1 = dblIntAry[0][1];
        int int2 = dblIntAry[2][3];
        int[] intAry = dblIntAry[1];

        char[][] dblChrAry = trpChrAry[0];
        char[] chrAry = dblChrAry[0];
        char chr1 = chrAry[1];
        char chr2 = trpChrAry[2][0][1];
    }
}
