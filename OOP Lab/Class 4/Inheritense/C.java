package Inheritense;

public class C extends B{
        public C(int id) {
            super(id);
        }

        void displayC() {
            System.out.println("Inside C Class" + " " + "ID: " + id);
        }
    }
