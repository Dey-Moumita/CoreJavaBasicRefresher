package edu.logic.solutions;

public class PrintingDatatypes {
    public static void main(String[] args) {

        int x = 10;
        float y = 12.56f;
        char z = 'A';
        String str = "Java";
// those all print statement will work in printf method only because it's formatted print method
        //it understands the special placeholder(%d,%f etc) & replace them with the values you pass after the format string
        //println don't understand format specifiers...it just print text.
        System.out.printf("Hello %d %f %c World\n",x,y,z);// %d represnt decimal
        System.out.printf("Hello %o %f %c World\n",x,y,z);//%o represnt octal
        System.out.printf("Hello %x %f %c World\n",x,y,z);//%x represent hexadecimal
        System.out.printf("Hello %f World\n",y);
        System.out.printf("Hello %e World\n",y);//it represent scientific representation
        System.out.printf("Hello %s \n",str);


//        System.out.printf("%1$d %1$d %1$d",x);
//        //1$ is argument index here 1st index is x
//        System.out.printf("%1$d %2$f %1$d",x,y);
//        //2$ is 2nd argument,here is y
//        System.out.printf("%3$s %2$f %1$d",x,y,str);

//        int a = 20;
//        System.out.printf("%5d",a);//d is the width ,here 5d means width is 5 ..after space the number will be print
//        int b = -20;
//        System.out.printf("%5d",b);
//        System.out.printf("%05d",b);
//        System.out.printf("%(5d",b);//when i use bracket it will not show the negative sign
//        float c = 123.45689f;
//        System.out.printf("%6.2f",c);//2f means after point it'll show 2 digits
//        String str1 = "DARK";
//        System.out.printf("%20s", str1);//it shows output after 20 spaces
//        System.out.printf("%-20s",str1);// it first shows the string then give space
//        System.out.format("%20s",str1);

        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);
        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        System.out.println(str4);



    }
}
