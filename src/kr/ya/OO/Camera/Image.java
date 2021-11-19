package kr.ya.OO.Camera;

import java.time.LocalDate;

public class Image {
    public String name;
    public LocalDate date;
    public int imageSize;
    public int imageFileSize;

    public Image(String name, int imageSize, int imageFileSize) {
        this.name = name;
        this.date = java.time.LocalDate.now();
        this.imageSize = imageSize;
        this.imageFileSize = imageFileSize;
    }
}
