package HomeWorkInteface;

/**
 * Created by java on 10.10.2016.
 */
enum Flavour {
    BITTER {
        @Override
        void printInfo() {
            System.out.println("I`am flavour bitter.");
        }
    },
    SALTY {
        @Override
        void printInfo() {
            System.out.println("I`am flavour salty.");
        }
    },
    SWEET;

    public static Flavour getFlavourByOrdinal(int ordinal) {
        if (values().length <= ordinal) {
            return null;
        }
        return values()[ordinal];
    }

    void printInfo() {
        System.out.println("I`am flavour.");
    }


}

enum Days {

}