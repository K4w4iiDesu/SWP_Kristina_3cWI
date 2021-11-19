package kr.ya.OO.Camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    public int capacity;
    public List<Image> imageList;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.imageList = new ArrayList<Image>();
    }

    public boolean checkSpace(int imageSize) {
        int usedSpace = 0;

        for (Image image :
                imageList) {
            usedSpace += image.imageFileSize;
        }

        if (usedSpace <= capacity * 0.7) {
            return true;
        }
        else if(usedSpace >= ((capacity * 0.7) - imageSize) && usedSpace <= capacity - imageSize){
            System.out.println("---Die SD-Karte ist mehr als wie 70% voll---");
            return true;
        } else {
            System.out.println("!!! Die SD-Karte ist voll. Bild wurde nicht gespeichert !!!");
            return false;
        }
    }
}
