package kr.ya.OO.Phone2;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM(2,"0664300");
        Camera camera = new Camera("12MP");

        SDcard sd_card = new SDcard(50);
        PhoneFile phone_file = new PhoneFile("png",2,"Tanzen");
        sd_card.addFile(phone_file);

        Phone phone = new Phone("black",sim,camera,sd_card);
        phone.makeCall("50033");
        phone.takePicture("jpg",20,"Test");
        phone_file.getInfo();
        phone.printAllFiles();
        System.out.println(phone.getFreeSpace());
    }

}
