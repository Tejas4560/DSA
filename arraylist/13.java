import java.util.*;

public class LibrarySorter {
    
    public static String[] sortBooksByGenre(int N, String[][] books) {
        // Sort the books array based on the genre (column 2) while maintaining stability
        Arrays.sort(books, (a, b) -> a[2].compareTo(b[2]));

        // Extract and return the titles
        String[] sortedTitles = new String[N];
        for (int i = 0; i < N; i++) {
            sortedTitles[i] = books[i][0];
        }

        return sortedTitles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character

        String[][] books = new String[N][3];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            books[i] = line.split(", ");
        }

        String[] result = sortBooksByGenre(N, books);
        
        for (String title : result) {
            System.out.println(title);
        }
    }
}
