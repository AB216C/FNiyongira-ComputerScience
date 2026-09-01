package aJavaBasics;
//Switch:  It's an alternative syntax to our classic if-else blocks!
//You should use break to get correct results

public class SwitchCase {
    public static void main(String[] args) {

        int grade = 70;

        switch(grade) {
            case 90:
                System.out.println("A");
                break;

            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;



        }
    }
}
