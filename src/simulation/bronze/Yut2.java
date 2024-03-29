package simulation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//2490 : 윷놀이 (방법2)
public class Yut2 {
    public static void main(String[] args) throws IOException {
        int N = 3;
        int M = 4;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(3, "A"); //도
        hm.put(2, "B"); //개
        hm.put(1, "C"); //걸
        hm.put(0, "D"); //윷
        hm.put(4, "E"); //모

        for (int i = 0; i < N; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                count += Integer.parseInt(st.nextToken());
            }
            System.out.println(hm.get(count));
        }


    }
}
