package kr.ya.OO.Phone2;

public class Camera {
    private String resolution;

    public Camera(String resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture(String extension, int size, String name){
        System.out.println("Making Picture");
        PhoneFile phone_file = new PhoneFile(extension,size,name);
        return phone_file;
    }
}