package twostrings;

import java.io.*;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) throws IOException {
        final var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final var bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        final int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                final var s1 = bufferedReader.readLine();

                final var s2 = bufferedReader.readLine();

                final var result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                System.out.println(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
