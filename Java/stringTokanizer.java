import java.util.StringTokenizer;

public class stringTokanizer {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("aishwaryaromod", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}