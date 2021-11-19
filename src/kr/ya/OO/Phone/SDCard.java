package kr.ya.OO.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }


    public void save(PhoneFile file){
        phoneFiles.add(file);
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public int getFreeSpace(){
        int size = 0;
        for (PhoneFile file: phoneFiles){
            size += file.getSize();
        }
        return capacity - size;
    }
}
