import java.util.HashMap;

public class CountNumbers {
    public static void main(String[] args) {
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 },
                        {5,7,6}
        };
        int ele = 7;
        count(matrix, ele);
    }

    public static void count(int matrix[][], int ele) {
        int row = matrix.length;
        int col = matrix[0].length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // if (matrix[i][j] == ele) {
                //     count++;
                // }
                // USING HASHMAPS
                mp.put(matrix[i][j], mp.getOrDefault(matrix[i][j], 0) + 1);
            }
        }
        for (var entry : mp.entrySet()) {
            if (ele == entry.getKey()) {
                System.out.println(entry.getValue());
            }
        }
    }

}

// class Student {
//     // static variable (shared by all objects)
//     static String college = "ABC College";

//     // non-static variable (unique for each object)
//     String name;

//     // Constructor
//     Student(String name) {
//         this.name = name;
//     }

//     void display() {
//         System.out.println("Name: " + name + ", College: " + college);
//     }
// }

// public class StaticVsNonStaticExample {
//     public static void main(String[] args) {
//         Student s1 = new Student("Pratik");
//         Student s2 = new Student("Charu");

//         // Both objects share same static variable (college)
//         s1.display();
//         s2.display();

//         // Change static variable using one object
//         s1.college = "XYZ University";

//         // Notice it changes for all objects
//         s1.display();
//         s2.display();
//     }
// }


// class Demo {
//     static void staticMethod() {
//         System.out.println("This is a static method.");
//     }

//     void nonStaticMethod() {
//         System.out.println("This is a non-static method.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Call static method directly (no object needed)
//         Demo.staticMethod();

//         // Call non-static method using object
//         Demo obj = new Demo();
//         obj.nonStaticMethod();
//     }
// }
