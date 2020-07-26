import com.sun.source.doctree.DocTree;

import javax.print.Doc;

class Army {

    public static void createArmy() {
        // Implement this method
        Unit dave = new Unit("Dave");
        Unit chloe = new Unit("Chloe");
        Unit stan = new Unit("Stan");
        Unit james = new Unit("James");
        Unit lars = new Unit("Lars");
        Knight jimmy = new Knight("Jimmy");
        Knight kirk = new Knight("Kirk");
        Knight tommy = new Knight("Tommy");
        General ozzy = new General("Ozzy");
        Doctor dio = new Doctor("Dio");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}