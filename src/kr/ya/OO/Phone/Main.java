package kr.ya.OO.Phone;

public class Main {
    public static void main(String[] args) {
        Camera c1 = new Camera(1080);
        SIM s1 = new SIM(1, "06606968823");
        SDCard card1 = new SDCard(8000);
        //PhoneFile pf1 = new PhoneFile(10, 42060, "idk");
        Phone p1 = new Phone(s1, c1, card1);

        p1.makeCall();
        p1.takePicture();
        p1.takePicture();
        p1.printAllFiles();
        System.out.println(p1.getFreeSpace());
        p1.takePicture();
    }
}
