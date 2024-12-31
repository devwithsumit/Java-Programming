package File_Handling;

import java.io.File;
import java.io.IOException;

public class CRUDinDirectory {
    public static void main(String[] args) throws IOException {
        /* Creating file or directory by File API
         * directory :- no extension (mkdir) */
        File dir = new File("/Users/apple/IdeaProjects/Java Programming/src/File_Handling/Directory");
        System.out.println(dir.mkdir());
        System.out.println(dir.isDirectory());
        System.out.println(dir.exists());
        System.out.println(dir.getAbsolutePath()); // full pathname

        File file = new File(dir.getAbsolutePath() + "/newFile.txt");
        System.out.println(file.createNewFile());
//        System.out.println(dir.delete());

    }
}
