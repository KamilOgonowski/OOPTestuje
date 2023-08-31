package program.documentFile;

import program.Console;

public class PdfDocument extends AbstractDocument{

    private boolean convertedToEbookReader;

    public PdfDocument(String name, int size, String creator) {
        super(name, size, creator);
    }
    public void makeReadyForReader(){
        if (Console.readDecision("Confirm that you want to keep going with processing the file (yes/no): "))
            convertedToEbookReader = true;
        else
            System.out.println("The user abandoned the process");
    }

    public boolean isConvertedToEbookReader() {
        System.out.print("The file is eligible to use it on an eBook Reader: " );
        return convertedToEbookReader;
    }
}
