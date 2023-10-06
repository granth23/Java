package Collections;
public class Arrays {
    public static void main(String[] args) {

        int [] marks = new int[5];

        // int [] marks;
        // marks = new int[5];

        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;

        // int [] marks = {98, 45, 79, 99, 80};

        // Quick Quiz: Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
