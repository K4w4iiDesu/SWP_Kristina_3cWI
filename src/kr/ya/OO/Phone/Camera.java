package kr.ya.OO.Phone;

public class Camera {
    int resolution = 1080;
    private int fileNumber = 0;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public PhoneFile takePicture(){
        System.out.println("i take picture");
        PhoneFile file = new PhoneFile("jpg",2000,"pic" + fileNumber);
        fileNumber++;
        return file;
    }
}
