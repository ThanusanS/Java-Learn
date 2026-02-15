
    public class Constructors_27 {
        int modelYear;
        String modelName;

        public Constructors_27(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            Constructors_27 myCar = new Constructors_27(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
    }

// Outputs 1969 Mustang

