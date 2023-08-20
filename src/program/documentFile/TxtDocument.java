package program.documentFile;

import program.Console;

import java.util.Scanner;

public class TxtDocument extends AbstractDocument{
    public TxtDocument(String name, int size, String creator) {
        super(name, size, creator);
    }

    public void updateContent(){

        if (!getContent().equals("[!empty file]")){
            System.out.println("Would you like to delete the content and replace it with new text?");

        } else{
            System.out.println("Please insert a new text: ");
            Scanner scanner = Console.scanner;
            String contentNew = scanner.nextLine();
            setContent(contentNew);


        }
        // look for way to compare both reference types by the value assigned to their fields - sth with hash
        // extract part of this method to console, so the implementation will be in correct class
    }


}
