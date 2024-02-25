package com.dev;

public class resultingdatatype {
    public static void main(String[] args) {
//        RESULTING DATA TYPE AFTER ARITHMETIC OPERATOR
        byte a = 5;
        int b = 6;
        short c= 8;
        int x = b+c;
        float z = 6.54f + x;
//        THIS WILL PRINT THE VALUE IN FLOAT DATA TYPE BECAUSE (RESULT = FLOAT+INT ==> FLOAT)
        System.out.println(z);




//        INCREMENT AND DECREMENT OPERATORS IN JAVA
        int i = 4;
//        THIS WILL PRINT SAME VALUE AS WE MENTIONED IN i BUT WHEN WE PRINT i AGAIN IT WILL INCREMENT THE VALUE OF i
        System.out.println(i++);
        System.out.println(i);

//       THIS WILL INCREMENT THE VALUE OF i FIRST AND PRINT THE VALUE IN INCREMENTED FORM
        System.out.println(++i);

//        THIS WILL PRINT THE VALUE FIRST AND THEN DECREASE IT
        System.out.println(i--);
        System.out.println(i);

//        THIS WILL DECREASE THE VALUE FIRST AND THEN USE IT
        System.out.println(--i);



//        QUICK QUIZ
        int y = 7;
        int j = y++*8;
        System.out.println(j);

    }
}