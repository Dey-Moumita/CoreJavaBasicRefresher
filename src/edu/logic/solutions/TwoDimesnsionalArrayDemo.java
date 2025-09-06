package edu.logic.solutions;

public class TwoDimesnsionalArrayDemo {
    public static void main(String[] args) {


        //varioustypes of Array initialization
//    int A[][] = new int[4][4];
//   int B[][] ={{1,2,3},{2,5,6},{1,3,9}};
//    int C[][];
//    C=new int[5][5];
//
//    int []D[] = new int[5][5];
//    int[] E,F[];//int[] E;int[]F[];
//    E=new int[5];
//    F= new int[5][5];

        int A[][] = {{1, 2, 3}, {2, 4, 7}, {3, 5, 8}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        for (int x[] : A) {
            for (int y : x) {
                System.out.println(y);
            }
        }
        //jagged array->here rows are uneven means each row can have a different length
        int B[][];
        B = new int[3][];
        B[0] = new int[5];
        B[1] = new int[3];
        B[2] = new int[8];

            }

        }


