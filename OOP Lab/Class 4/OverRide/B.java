package OverRide;

public class B extends A{
        public B(int id) {
            super(id);
        }

        void displayB() {
            System.out.println("Inside B Class" + " " + "ID: " + id);
        }
        void to_override()
        {
            System.out.println("This Is B Class");
        }

    }

