package program.documentFile;

import program.file.AbstractFile;
import program.file.FileType;

public abstract class AbstractDocument extends AbstractFile implements DocumentFile{
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
    }
    public void readDocument(){
        if (isOpen)
            System.out.println(getContent());
        else
            System.out.println("To read the file " + getName() + " you must firstly open it!");
    }

    public void closeDocument() {
        if(isOpen){
            System.out.println("Closing of the document " + getName());
            isOpen = false;
        } else {
            System.out.println(getName() + " such file is not working currently.");
        }
    }

    public void changeDocumentName(String newName) {
    // check if the file is on drive and then allow change its name - program later
        if (isOpen)
            System.out.println("Close file first to change it's name!");
        else
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

    public String readContent(){
        if (getContent().isEmpty()){
            return "The file " + name + " is empty";
        } else {
            System.out.println("Loading of the file " + name + "...");
            return getContent();
        }
    }
}
