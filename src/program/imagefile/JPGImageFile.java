package program.imagefile;

public class JPGImageFile extends AbstractImageFile {
    private int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }
    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Displaying JPG");
    }

    @Override
    public String toString() {
        return "JPG File Details \n{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
