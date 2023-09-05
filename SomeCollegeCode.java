public class SomeCollegeCode {
    public static String wizardOfOz(int maxDistance, float maxHostility) {
        boolean place1Cond1 = false;
        boolean place1Cond2 = false;
        boolean place2Cond1 = false;
        boolean place2Cond2 = false;
        boolean place3Cond1 = false;
        boolean place3Cond2 = false;
        boolean place4Cond1 = false;
        boolean place4Cond2 = false;
        if (maxDistance <= 1500) {
            place1Cond1 = true;
            place2Cond1 = true;
            place3Cond1 = true;
            place4Cond1 = true;
        }
        if (maxDistance <= 1000) {
            place1Cond1 = true;
            place2Cond1 = true;
            place3Cond1 = true;
        }
        if (maxDistance <= 600) {
            place1Cond1 = true;
            place2Cond1 = true;
        }
        if (maxDistance <= 200) {
            place1Cond1 = true;
        }
        if (maxHostility >= 9.0F) {
            place1Cond2 = true;
            place2Cond2 = true;
            place3Cond2 = true;
            place4Cond2 = true;
        } 
        if (maxHostility >= 7.0F) {
            place2Cond2 = true;
            place3Cond2 = true;
            place4Cond2 = true;
        }
        if (maxHostility >= 3.0F) {
            place3Cond2 = true;
            place4Cond2 = true;
        }
        if (maxHostility >= 1.0F) {
            place4Cond2 = true;
        }
        boolean bothConds1 = false;
        boolean bothConds2 = false;
        boolean bothConds3 = false;
        boolean bothConds4 = false;
        if (place1Cond1 && place1Cond2) {
            bothConds1 = true;
        }
        if (place2Cond1 && place2Cond2) {
            bothConds2 = true;
        }
        if (place3Cond1 && place3Cond2) {
            bothConds3 = true;
        }
        if (place4Cond1 && place4Cond2) {
            bothConds4 = true;
        }
        if (!bothConds1 && !bothConds2 && !bothConds3 && !bothConds4) {
            return "Dorothy must go back to Kansas.";
        }
        if (bothConds1) {
            return "Deadly Desert";
        } else if (bothConds2) {
            return "Munchkin Country";
        } else if (bothConds3) {
            return "Winkie Country";
        } else if (bothConds4) {
            return "Emerald City";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(wizardOfOz(1000,8));
    }
}
