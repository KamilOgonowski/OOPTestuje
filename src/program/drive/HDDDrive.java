package program.drive;

import program.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive{
    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
//        files.forEach(System.out::println);   -> cos z API Stream, jednak nieuzywane w implementacji metody

        for (File file: files)
            System.out.println(file.getName());
    }

    @Override
    public File findFile(String name) {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();

        return foundFile.orElseThrow();
    }
}
