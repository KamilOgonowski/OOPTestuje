package program.documentFile;

import program.Console;

public class TxtDocument extends AbstractDocument{
    public TxtDocument(String name, int size, String creator) {
        super(name, size, creator);
    }
    public void updateContent(){
        if (!isOpen) {
            System.out.println("Open a file first!");
            if (actionCheck("Do you want open a file? (yes/no):"))
                openDocument();
            else {
                System.out.println("You decided to not to open the file. You cannot make any changes of the file's content while it's closed!");
                return;
            }
        }
        if (actionCheck("Would you like to override the content? (yes/no): "))
            setContent(Console.userInput("Please insert a text: "));
        else
            System.out.println("The user decided to not yo update the file!");
        }
    private boolean actionCheck(String prompt){
        return Console.readDecision(prompt);
    }
//        in case the file is closed at the begining and after opening it is empty, no such information is being displayed - change the code flow, think how to make it less procedural
}
