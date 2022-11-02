import java.util.Scanner;
public class ArrayProcessing {

    int[] objArray = {0,0,0,0,0};

    Scanner scanman = new Scanner(System.in);

    public ArrayProcessing() {
    }

    public void getNumbers() {
        for(int i = 0; i < objArray.length; i++) {
            System.out.println("Input a value for the array: ");
            objArray[i] = scanman.nextInt();
        }
    }

    public void processNumbers() {
        switch (printMenu()) {
            case 1:
                add();
                break;
            case 2:
                mult();
                break;
            case 3:
                print();
                break;
            case 4:
                reverse();
                break;
        }

    }

    private int printMenu() {
        System.out.printf("1) Add numbers %n2) Multiply numbers %n3) Print numbers %n4) Print number in reverse");
        int input = scanman.nextInt();
        return input;
    }

    private void add() {
        int sum = 0;
        for(int i=0; i<objArray.length; i++) {
            sum = sum + objArray[i];
        }
        System.out.println("The sum is " + sum);
    }

    private void mult() {
        int pro = 1;
        for(int i=0; i<objArray.length; i++) {
            pro = pro * objArray[i];
        }
        System.out.println("The product is " + pro);
    }

    private void print() {
        System.out.printf("The following are the array values:%n");
        for(int i=0; i<objArray.length; i++) {
            System.out.println(i+". "+objArray[i]);
        }
    }

    private void reverse() {
        System.out.printf("The following are the array values in REVERSE:%n");
        for(int i=objArray.length-1; i>-1; i--) {
            System.out.println(i+". "+objArray[i]);
        }
    }

    public static void main(String[] args) {
        ArrayProcessing arr = new ArrayProcessing();
        arr.getNumbers();
        arr.processNumbers();
    }
}