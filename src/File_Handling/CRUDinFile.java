package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CRUDinFile {

    public static void main(String[] args) throws IOException {

        /** Creating file or directory by File API
         * directory :- no extension (mkdir)
         * file :- with extension followed by name (name.ext). IMP - file will be created without extension also*/

        //FILE(Complete path name + file/folder name);
        File file = new File("/Users/apple/IdeaProjects/Java Programming/src/File_Handling/file.txt");
        // createNewFile works only for file
        System.out.println("File created: " + file.createNewFile()); //false if file already exits or not created by other reasons

        //some common useful methods
        System.out.println("is directory: " + file.isDirectory());
        System.out.println("is file: " + file.isFile());
        System.out.println("Exists ?: " + file.exists());
        System.out.println("Pathname: " + file.getAbsolutePath());

        /** Write operation in file by FileWriter API*/
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Some text written in file by program");
        fileWriter.close(); // necessary to save the text in the file

        /** Reading file by FileReader API*/
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) >= 0) {
            System.out.print((char) i);
        }

        /** Deleting of file or directory*/
//        System.out.println("delete: " + file.delete());
    }
}
