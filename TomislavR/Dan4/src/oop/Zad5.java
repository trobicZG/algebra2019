package  oop;

public class Animal {
        private String color;
        private double speed;
        private int legsCount;
        private int teethCount;

        public void setColor(String color) {
            this.color = color;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public void setLegsCount(int legsCount) {
            this.legsCount = legsCount;
        }

        public void setTeethCount(int teethCount) {
            this.teethCount = teethCount;
        }

        public double getSpeed() {
            return speed;
        }

        public int getLegsCount() {
            return legsCount;
        }

        public int getTeethCount() {
            return teethCount;
        }

        public String getColor() {
            return color;
        }

}


