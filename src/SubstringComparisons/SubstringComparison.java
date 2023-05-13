package SubstringComparisons;

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String sub = s.substring(0, k);
        smallest = sub;
        largest = sub;
        for(int i = 0; i <= s.length() - k; i++) {
            sub = s.substring(i, i + k);
            if(sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if(sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }

        return smallest + "\n" + largest;
    }
}
