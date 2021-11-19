package kr.ya.OO.RemoteControl;

public class RemoteControl {
        private Battery battery1;
        private Battery battery2;

        public RemoteControl(Battery battery, Battery battery2) {
            this.battery1 = battery;
            this.battery2 = battery2;
        }

        public double getStatus() {
            return (battery1.getBatterystatus()+battery2.getBatterystatus())/2;
        }

        public Battery getBattery() {
            return battery1;
        }

        public void setBattery(Battery battery) {
            this.battery1 = battery;
        }

        public Battery getBattery2() {
            return battery2;
        }

        public void setBattery2(Battery battery2) {
            this.battery2 = battery2;
        }
}
