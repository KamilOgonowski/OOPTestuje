package program;

import program.file.File;
import program.file.imagefile.GIFImageFile;
import program.file.imagefile.JPGImageFile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JPGImageFile jpgImageFile = new JPGImageFile("plik1.jpg", 100, 100);
        GIFImageFile gifImageFile = new GIFImageFile("plik2", 200);

        List<File> files = new ArrayList<>();
        files.add(jpgImageFile);
        files.add(gifImageFile);

//        for (File file : files){
//            if (file instanceof JPGImageFile){
//                System.out.println(file);
//            } else{
//                System.out.println(file.getName() + " is not of a JPG extension");
//            }
//        }
        for (File file : files){
            if (file instanceof JPGImageFile) {
                System.out.println(file.getName() + " this file has extension: JPG");
            }else if (file instanceof GIFImageFile) {
                System.out.println(file.getName() + " this file has extension: GIF");
            }
        }
        GIFImageFile gifImageFile1 = new GIFImageFile("plik.gif", 100);
        System.out.println(gifImageFile1.getVersion());

    }
}