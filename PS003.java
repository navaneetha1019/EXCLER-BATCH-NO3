class Bowler {
    String name;
    int wickets;
    int matches;
    int ballsBowled;
    int runsConceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public void computeBowlingAverage() {
        if (hasError()) {
            System.out.println("Error");
            return;
        }
        if (wickets == 0) {
            System.out.println("Bowling average cannot be computed as wickets are 0.");
            return;
        }
        double bowlingAvg = (double) runsConceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowlingAvg);
    }

    public void showStatistics() {
        if (hasError()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + ballsBowled);
        System.out.println("runs_conceded=" + runsConceded);
    }

    public void computeStrikeRate() {
        if (hasError()) {
            System.out.println("Error");
            return;
        }
        if (ballsBowled == 0) {
            System.out.println("Strike rate cannot be computed as balls bowled is 0.");
            return;
        }
        double strikeRate = (double) runsConceded / ballsBowled;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + strikeRate);
    }

    private boolean hasError() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            return true;
        }
        if ((runsConceded > 0 || ballsBowled > 0) && matches == 0) {
            return true;
        }
        return false;
    }
}

public class PS003 {
    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}
