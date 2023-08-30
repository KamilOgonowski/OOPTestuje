package program;

import program.documentFile.TxtDocument;

public class Main {
    public static void main(String[] args) {
//        JPGImageFile jpgImageFile = new JPGImageFile("plik1.jpg", 100, 100);
//        GIFImageFile gifImageFile = new GIFImageFile("plik2", 200);
//
//        List<File> files = new ArrayList<>();
//        files.add(jpgImageFile);
//        files.add(gifImageFile);

//        for (File file : files){
//            if (file instanceof JPGImageFile){
//                System.out.println(file);
//            } else{
//                System.out.println(file.getName() + " is not of a JPG extension");
//            }
//        }
//        for (File file : files){
//            if (file instanceof JPGImageFile) {
//                System.out.println(file.getName() + " this file has extension: JPG");
//            }else if (file instanceof GIFImageFile) {
//                System.out.println(file.getName() + " this file has extension: GIF");
//            }
//        }
//        GIFImageFile gifImageFile1 = new GIFImageFile("plik.gif", 100);
//        System.out.println(gifImageFile1.getVersion());

        TxtDocument txtDocument = new TxtDocument("FirstDoc.txt", 460, "xyz");
        System.out.println(txtDocument.getName());
        txtDocument.openDocument();
        txtDocument.readDocument();
        txtDocument.closeDocument();
        txtDocument.changeDocumentName("After name change.txt");
        System.out.println(txtDocument.getName());

        txtDocument.updateContent();
        System.out.println(txtDocument.getContent());
        txtDocument.updateContent();

        System.out.println(txtDocument.readContent());

    }
}