package aJavaBasics;
public class SwitchChallenge {
    public static void main(String[] args) {

        int number = 120;

        int level = number/10;

        switch(level) {
            case 5:
                System.out.println("Top Level");
                break;
            case 4:
                System.out.println("4th Level");
                break;
            case 3:
                System.out.println("3rd Level");
                break;
            case 2:
                System.out.println("2nd Level");
                break;
            case 1:
                System.out.println("Lower Level");
                break;
            default:
                System.out.println("Unknown level");
        }
    }
}
