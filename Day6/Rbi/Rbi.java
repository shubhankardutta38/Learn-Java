package Rbi;

class RBIBank {
    int getRateOfInterest_FD() {
        return 6;

    }
}

class SBI extends RBIBank {
    int getRateOfInterest_FD() {
        return 9;

    }
}

class AXIS extends RBIBank {
    int getRateOfInterest_FD() {
        return 10;
    }
}

class ICICI extends RBIBank {
    int getRateOfInterest_FD() {
        return 8;
    }

}

class Rbi {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of interest:" + s.getRateOfInterest_FD());
        System.out.println("ICICI rate of interest:" + i.getRateOfInterest_FD());
        System.out.println("AXIS rate of interest:" + a.getRateOfInterest_FD());
    }
}
