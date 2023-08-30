package program.documentFile;

import program.Console;

public class TxtDocument extends AbstractDocument{
    public TxtDocument(String name, int size, String creator) {
        super(name, size, creator);
    }

    public void updateContent(){
        if (isOpen){
            if (!getContent().isEmpty()){
                System.out.println("Would you like to delete the content and replace it with new text? (yes/no): ");
                while (true){
                    String response = Console.scanner.nextLine();
                    if (response.equalsIgnoreCase("yes")) {
                        System.out.println("Please insert a new text");
                        break;
                    }
                    else if (response.toLowerCase().equals("no"))
                        return;
                    else
                        System.out.println("You gave a wrong answer. Try again");
                }
            }
            else
                System.out.println("The file is empty. Please insert a new text: ");
        String contentNew = Console.scanner.nextLine();
        setContent(contentNew);
        } else
            System.out.println("Open a file first!");
        System.out.println("DO you want to open a file?: ");
        String response = Console.scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            openDocument();
            updateContent();
        } else
            System.out.println("You decided to not to open the file. You cannot make any changes of the file's content while it's closed!");

        // look for way to compare both reference types by the value assigned to their fields - sth with hash
        // extract part of this method to console, so the implementation will be in correct class
    }


}
