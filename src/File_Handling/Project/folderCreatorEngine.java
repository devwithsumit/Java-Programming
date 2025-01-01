package File_Handling.Project;

import java.io.*;

public class folderCreatorEngine {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //**-- use this code if you want to get particular directory for you project from the user
//        System.out.print("Enter the path where you want to create your project folder: ");
//        String directoryPath = br.readLine();

        String directoryPath = "/Users/apple/IdeaProjects/Java Programming/src/File_Handling/Project";
        if(directoryPath.charAt(directoryPath.length() - 1) != '/') directoryPath += '/';

        /* current folder path:- /Users/apple/IdeaProjects/Java Programming/src/File_Handling/Project */
        System.out.print("Enter name of your project: ");
        String projectName = br.readLine();

        File dir = new File(directoryPath + projectName);
        try {
            if(dir.mkdir()){
                System.out.println("Folder created successfully");
            }else{
                System.out.println("Error creating Directory");
            }
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        File HTMLfile =  new File(dir.getAbsolutePath() + "/index.html");
        HTMLfile.createNewFile();
//        System.out.println(HTMLfile.createNewFile() ? "file created successfully" : "File creation failed");
        FileWriter HTMlfileWriter =  new FileWriter(HTMLfile);
        HTMlfileWriter.write(("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "    <script src=\"https://cdn.tailwindcss.com\"></script>\n" +
                "    <title>Your Project</title>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <main>\n" +
                "        <h1 class=\"text-center font-semibold\">Your tailwind <br>web page is ready</h1>\n" +
                "    </main>\n" +
                "\n" +
                "    <script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "\n" +
                "</html>"));
        HTMlfileWriter.close();


        File CssFile =  new File(dir.getAbsolutePath() + "/style.css");
        CssFile.createNewFile();
        FileWriter CssFileWriter = new FileWriter(CssFile);
        CssFileWriter.write(("*{\n" +
                "    padding: 0;\n" +
                "    margin: 0;\n" +
                "    box-sizing: border-box;\n" +
                "}\n" +
                "html,body{\n" +
                "    height: 100%;\n" +
                "    width: 100;\n" +
                "}\n" +
                "main{\n" +
                "    height: 100%;\n" +
                "    width: 100%;\n" +
                "    display: flex;\n" +
                "    align-items: center;\n" +
                "    justify-content: center;\n" +
                "    background-color: #505050;\n" +
                "}\n" +
                "\n" +
                "h1{\n" +
                "    color: whitesmoke;\n" +
                "    font-size: 7vw !important;\n" +
                "}"));
        CssFileWriter.close();

        File javaFile = new File(dir.getAbsolutePath() + "/script.js");
        javaFile.createNewFile();
    }
}
