package kr.ya.OO.Phone2;

import java.util.ArrayList;
import java.util.List;

public class SDcard {
    private int capacity;
    private List<PhoneFile> files;


    public SDcard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void addFile(PhoneFile file){
        this.files.add(file);
    }

    public List<PhoneFile> getAllFiles(){
        return files;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public void setFiles(List<PhoneFile> files) {
        this.files = files;
    }

    public int getFreeSpace(){
        int numberofFiles = this.getAllFiles().size();
        int sizeOfFiles = 0;
        for (int i = 0; i < numberofFiles; i++) {
            sizeOfFiles = sizeOfFiles + this.getAllFiles().get(i).getSize();
        }

        int freeSpace = this.getCapacity() - sizeOfFiles;

        return freeSpace;
    }
}
