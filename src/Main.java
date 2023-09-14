
public class Main {
    static void myMethod() {
        System.out.println("I am a method");
    }
    public static void main(String[] args) {
        //speocial characters
        // the backlash escape turns special characters into string
        String txt = "We are the so called \"vikings\" from the north";
        String txt2 = "It's alright";

        //MATHEMATICAL OPERATIONS
        Math.max(3,6);
        Math.min(2,1);
        Math.sqrt(64);
        Math.abs(-4.5);
        //returns random number between 0.0 and 1.0
        Math.random();
// to get a random value between specific number
        int randomnum = (int)(Math.random() * 100); //0 - 100 (not including 100)
        System.out.println(randomnum);

        //If else statement
        int time = 20;
        if (time < 18) {
            System.out.println("good day");
        } else if (time == 20) {
            System.out.println("good midday");

        } else {
            System.out.println("good evening");
        }

        // short hand if else (ternary operator) fx below
        // variable = (condition) ? expressiontrue : expressionfalse;
        String result = (time > 20) ? "Good day" : "Goodnight";
        System.out.println(result);

        //Java Switch statements
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("nothing found");
        }

        //while loops
        //will run the code as long as the condition is true
        int i =0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //do while loop
        //will run the code once before checking the condition
        // and then will run the code as long as the condition is true.
        int p = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
        //for loop
        for (int q = 0;q<6;q++) {
            System.out.println(i);
        }
        //nested loops
        for (int w =0;w < 3;w++) {
            System.out.println("outer " + w);
            for (int t=0;t <6;t++) {
                System.out.println("Inner " + t);
            }
        }
        //for each loop
        //used exclusively to loop through the elements in an array
        String[] cars = {"toyota","bmw"};
        //fx = for (type variablename : arrayname) {//block code}
        for (String h: cars) {
            System.out.println(h);
        }
        //break -- used to jump out of a loop
        //continue -- used to break one iteration of the loop
        //this will work only till 15 and then stop
        for (int num =10;num <20;num++) {
            if (num == 15) {
                break;
            }
            System.out.println(num);

        }
        //this will just skip the number 15 and then continue
        for (int num2 =10;num2 <20;num2++) {
            if (num2 == 15) {
                continue;
            }
            System.out.println(num2);

        }

        //continue inside a loop examply
        /*int number =0;
        while ( number < 10) {

            if (number == 5) {
                continue;
            }
            System.out.println(number);
            number++;
        }*/
        // arrays
        //used to store multiple values in single variable
        String[] names = {"riyaya","jojo","y"};
        System.out.println(names[2]);
        //change an array element
        names[0] = "riyuu";
        System.out.println(names[0]);
        //array length
        System.out.println(names.length);

        //loop through an arrayjjknnjk
        for (int name = 0; name < names.length;name++) {
            System.out.println(names[name]);
        }
        //other way (for each way)
        for (String name: names) {
            System.out.println(name);
        }

        //multidimensional arrays
        // used when u want to store data in tabular form - rows and columns
        int [] [] mynum = { {1,2,3}, {5,6,7}};
        //accesing the elements
        //first [] is number of inside array
        // and the second [] is the number of element inside that array
        System.out.println(mynum[0][1]);
        //change element value
        mynum[0][1] = 8;
        System.out.println(mynum[0][1]);

        //looping through multi directional array
        for (int f=0;f<mynum.length;f++) {
            for (int d=0;d<mynum.length;d++) {
                System.out.println(mynum[f][d]);
            }
        }

        //Methods
        //this method is written outside the main method but inside the Main class.
        // to call this method you need to call its name inside the main method
        myMethod();
        /*
        static void myMethod() {
            //code to be exceuted if this method is called
        }*/
       
       












    }
}