package softeer.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BallotCounting {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();
        int[] candidates = new int[n];
        int[] fives = new int[n];
        int[] remnants = new int[n];
        String[] printArr = new String[n];

        // assign.
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = Integer.parseInt(br.readLine());

            remnants[i] = candidates[i] % 5;
            fives[i] = candidates[i] - remnants[i];

            printArr[i] = "";
        }

        // String.repeat()
        for (int i = 0; i < candidates.length; i ++) {
            printArr[i] += "+++++ ".repeat(fives[i] / 5 >= 1 ? fives[i] / 5 : 0) +
                    "|".repeat(remnants[i]);
            System.out.println(printArr[i]);
        }

        // builders with String.repeat()
//        for (int i = 0; i < candidates.length; i ++) {
//            StringBuilder builder = new StringBuilder(printArr[i]);
//            builder.append("+++++ ".repeat(fives[i] / 5 >= 1 ? fives[i] / 5 : 0));
//            builder.append("|".repeat(remnants[i]));
//            System.out.println(builder.toString());
//        }

        // build builders
//        for (int i = 0; i < candidates.length; i++) {
//            StringBuilder builder = new StringBuilder(printArr[i]);
//            for (int j = 0; j < fives[i]; j++) {
//                if (j != 0 && j % 5 == 0) {
//                    builder.append(" ");
//                }
//                builder.append("+");
//            }
//            if (fives[i] > 5) {
//                builder.append(" ");
//            }
//            builder.append("|".repeat(remnants[i]));
//
//            System.out.println(builder.toString());
//        }

    }

}
