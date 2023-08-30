package program.documentFile;

import program.Console;

public class TxtDocument extends AbstractDocument{
    public TxtDocument(String name, int size, String creator) {
        super(name, size, creator);
    }

    public void updateContent(){
        if (isOpen){
            if (!getContent().isEmpty()){
                while (true){
                    boolean actionCheck = Console.readDecision("Would you like to delete the content and replace it with new text? (yes/no): ");
                    if (!actionCheck)
                        return;
                }
            }
            else {
                boolean actionCheck = Console.readDecision("The file is empty. Would you like to add new text? (yes/no):");
                if (!actionCheck) {
                    System.out.println("The user decided not to open the file " + name);
                    return;
                }
            }
        } else {
            System.out.println("Open a file first!");
            boolean actionCheck = Console.readDecision("Do you want open a file? (yes/no):");
            if (actionCheck)
                openDocument();
            else {
                System.out.println("You decided to not to open the file. You cannot make any changes of the file's content while it's closed!");
                return;
            }
        }
        System.out.println("Please insert a text: ");
        String newContent = Console.scanner.nextLine();
        setContent(newContent);
        // look for way to compare both reference types by the value assigned to their fields - sth with hash
        // extract part of this method to console, so the implementation will be in correct class
    }
//        in case the file is closed at the begining and after opening it is empty, no such information is being displayed - change the code flow, think how to make it less procedural
}
