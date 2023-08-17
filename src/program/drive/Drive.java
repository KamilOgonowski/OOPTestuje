package program.drive;

import program.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String name);

}
