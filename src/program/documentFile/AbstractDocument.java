package program.documentFile;

import program.Console;
import program.file.AbstractFile;
import program.file.FileType;

public abstract class AbstractDocument extends AbstractFile implements DocumentFile{
    public String fileExtension;

    private String creator;
    private String content = "";
    public boolean isOpen;

    protected AbstractDocument(String name, int size, String creator){
        super(name, size);
        this.creator = creator;
    }

    public void openDocument() {
        isOpen = true; // write condition tht only when isOpen you can read it
        System.out.println(getName() + " is opening");
        displayContent();
    }
    private void displayContent(){
        if (isOpen) {
            if (content.isEmpty()) {
                System.out.println("The file is empty");
                return;
            }
            System.out.println(getContent());
        }
        else
            System.out.println("Nothing to display, as the file  " + getName() + " is closed. \nYou must open it first to see the content!");
    }
    public void closeDocument() {
        if(isOpen){
            System.out.println("Closing of the document " + getName());
            isOpen = false;
        } else {
            System.out.println(getName() + " such file is not working currently.");
        }
    }

    public void changeDocumentName() {
    // check if the file is on drive and then allow change its name - program later
        if (isOpen) {
            if (Console.readDecision("Close file first to change its name! Do you want to close it now? (yes/no): ")) {
                closeDocument();
                System.out.println("The file has been closed. Please provide a new name for the file.");
            } else {
                System.out.println("The name change cannot be made, as the user decided to not to close it.");
                return;
            }
        }

        String newName = Console.userInput("Please provide a new name for the file: ");
        System.out.println("The old name " + name + " has been replaced with the new name: " + newName);
        name = newName;
        }

    public String getCreator() {
        return creator;
    }

    public String getContent() {
        return content;
    }

    @Override
    public FileType getType() {
        return FileType.DOCUMENT;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public String readContent(){
//        if (getContent().isEmpty()){
//            return "The file " + name + " is empty";
//        } else {
////            System.out.println("Loading of the file " + name + "...");
//            return getContent();
//        }
//    }
}
