package aJavaBasics;
public class LoopConstructs {
    public static void main(String[] args) {
//
//        int x = 5;  //Already declared Values
//        int y = 0;
//        int z = 7;
//
//        for(y = 10, x = 10, z= 20; x<15&&y<20; x++, y++){
//            System.out.println(x + "_X");
//            System.out.println(y + "_Y");

            //redefining variable x
            //Every value is reassignment

//        String[] StudentNames = new String[3];
//
//        StudentNames[0] = "Joe";
//        StudentNames[1] = "Joe1";
//        StudentNames[2] = "Joe2";
//
//        for (String name: StudentNames) {
//            System.out.println(name);
//        }



//         String[] fruits = new String[4];
//
//         fruits[0] = "Banana";
//         fruits[1] = "Juice";
//         fruits[2] = "Pineapple";
//         fruits[3] = "Butter";
//
//         for(String fruit: fruits) {
//             System.out.println(fruit);
//         }

//
//        String[] Colors = new String[4];
//
//        Colors[0] = "Blue";
//        Colors[1] = "Red";
//        Colors[2] = "Yellow";
//        Colors[3] = "Green";
//
//
//        for(String color:Colors) {
//            System.out.println("Best color " + color);
//        }


        // do---while loop

//
//        int x = 0;
//
//        do {
//            System.out.println(x + " Beni");
//            x++;
//        }while (x<10);

//        int y = 100;
//        do {
//            System.out.println(y);
//            y--;
//
//        } while (y>0);

        // NESTED LOOPS
//
//        for (int i=0; i<=5; i++ ) {
//            for(int j=0; j<=10; j++) {
//                System.out.println("i : "+ i + " and j : " + j);
//            }
//        }

        //BREAK STATEMENT DURING FOR LOOP
//
//        for(int i=0; i<=10; i++ ) {
//            if(i==4) {
//                break;
//            }
//            System.out.println(i);
//        }
//
//        for(int j = 100; j>=0; j--) {
//            if(j==85) {
//                break;
//            }
//            System.out.println("J'aime le seigneur " + j+"x");
//        }

        //CONTINUE STATEMENT DURING A FOR LOOP

        //This loop will skip a specific number as defined by if statement and continue code

        for( int x = 0; x <= 7; x++) {
            if(x==4) {
                continue;
            }
            System.out.println(x + " Count");
        }
    }
}
