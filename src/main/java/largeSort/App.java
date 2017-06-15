package largeSort;

import com.google.code.externalsorting.ExternalSort;
import java.io.*;
import java.nio.file.Paths;

public class App {
    public static void main( String[] args ) {
        System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
        try {
            ExternalSort.mergeSortedFiles(
                ExternalSort.sortInBatch(new File("./words/words.txt"), (a, b) -> { return a.compareTo(b); }),
                new File("./words/AtoZ.txt")
            );

            ExternalSort.mergeSortedFiles(
                    ExternalSort.sortInBatch(new File("./words/words.txt"), (a, b) -> { return b.compareTo(a); }),
                    new File("./words/ZtoA.txt")
            );
        }catch(Exception e){
            System.out.print(e.toString());
        }finally{

        }
    }
}
