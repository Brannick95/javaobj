public class classes {
    public static void main(String[] args) throws Exception {

    }

    public class pet {
        private String name;
        private int age;
        private String location;
        private String type;

        public pet cat = new pet() {

        };
        public pet dog = new pet() {

        };

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getType() {
            return type;
        }

        public void setName(String name) {

        }

        public void setAge(int age) {

        }

        public void setLocation(String location) {

        }
    }

    public class car {
        private String name;
        private int seats;
        private boolean fast;

        public car() {

        }

        public car(String name, int seats) {
            this.name = "van";
            this.seats = 7;
        };

        public car(String name, int seats, boolean fast) {
            this.name = "mustang";
            this.seats = 2;
            this.fast = true;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public boolean getFast() {
            return fast;
        }

        public void setFast(boolean fast) {
            this.fast = fast;
        }

        public boolean isPaidOff() {
            return true;
        }

        public String carSound() {
            return "vroom vroom";
        }
    }

}