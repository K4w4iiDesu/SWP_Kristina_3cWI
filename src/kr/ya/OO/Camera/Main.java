package kr.ya.OO.Camera;

public class Main {
    public static void main(String[] args) {
        Settings sLow = new Settings("Low Quality", 1000, 2);
        Settings sMedium = new Settings("Medium Quality", 2000, 4);
        Settings sHigh = new Settings("High Quality", 3000, 6);

        Manufacturer m1 = new Manufacturer("Canon", "Japan");

        Lens l1 = new Lens(55, m1);

        SDCard sdCard1 = new SDCard(10);
        SDCard sdCard2 = new SDCard(50);

        Camera c1 = new Camera(50, 2000, "black", m1, l1, sdCard1, sLow);

        c1.takePicture();
        c1.setSettings(sHigh);
        c1.takePicture();
        c1.setSettings(sLow);
        c1.takePicture();
        c1.getAllPictures();
        c1.takePicture();

        c1.setSdCard(sdCard2);
        c1.setSettings(sHigh);
        c1.takePicture();
        c1.takePicture();
        c1.takePicture();
        c1.takePicture();
        c1.setSettings(sMedium);
        c1.takePicture();
        c1.setSettings(sLow);
        c1.takePicture();
        c1.getAllPictures();

        c1.setSdCard(sdCard1);
        c1.getAllPictures();
    }
}
