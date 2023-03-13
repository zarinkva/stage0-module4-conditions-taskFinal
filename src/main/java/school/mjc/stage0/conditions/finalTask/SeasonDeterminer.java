package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong month number");
        }
    }

    public static void main(String[] args) {
        SeasonDeterminer determiner=new SeasonDeterminer();
        determiner.tellTheSeason(100);
        determiner.tellTheSeason(0);
        determiner.tellTheSeason(1);
        determiner.tellTheSeason(5);
        determiner.tellTheSeason(8);
        determiner.tellTheSeason(11);
    }
}
