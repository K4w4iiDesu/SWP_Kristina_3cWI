package kr.ya.OO.RemoteControl;

public class Main {
        public static void main(String[] args) {
            Battery battery = new Battery(100, 100);
            Battery battery2 = new Battery(100, 100);
            RemoteControl remoteControl = new RemoteControl(battery, battery2);
            System.out.println(remoteControl.getStatus());
        }
}
