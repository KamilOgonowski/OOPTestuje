package program.file.imagefile;

import program.file.AbstractFile;
import program.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name,size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }

}
