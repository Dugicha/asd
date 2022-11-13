import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
//        Davaleba #1
//
//        Random rand = new Random();
//        int n = 160;
//
//        int[] array = new int[n];
//
//        double sum = 0;
//        double average = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt(n);
//            sum += array[i];
//            average = sum / array.length;
//        }
//        System.out.println("Amount of numbers is: " + n);
//        System.out.println("Sum is: " + sum);
//        System.out.println("Average is: " + average);



class Function {
    public static int Average(int[] array){
        int jami=0;
        int len=0;
        for(int i=0;i<array.length;i++)
            if(array[i]>150) {
                jami += array[i];
                len += 1;
            }
        return jami/len;
    }
}

class Function2 {
    public static double Avverage(int[] array) {
        int odd_product = 1;
        double amount = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd_product *= array[i];
                amount += 1.0;
            }
        }
        return Math.pow(odd_product,1/amount);
    }
}


public class Main {
    public static void main(String[] args){
//        int[] array = {100,200,300,150,400,20,10,200};
//        System.out.println(Function.Average(array));
        int[] array = {22,2,12,4,4,6,2};

        System.out.println(Function2.Avverage(array));
    }
}


//        Davaleba #2

//        int mass1[] = { 3, 5, 9, 10, 11, 14, 17, 29};
//
//        int sum = 1;
//        double n = 0;
//        for ( int i = 0; i < mass1.length; i++ ) {
//            if ( mass1[i] % 2 != 0 ) {
//                sum = sum * mass1[i];
//                ++n;
//            }
//        }
//        System.out.println("Amount of numbers is: " + n);
//        System.out.println("Sum is: " + sum);
//        System.out.println("Answer is: " + Math.pow(sum,1/n));


//        Davaleba #3

//        Department d1 = new Department(1, "IT", "Roma");

//        System.out.println(d1.getName());
//        System.out.println(d1.getEmployee());
//        System.out.println(d1.getId());
//        System.out.println(d1.toString());


//        Davaleba #4

//        FileUtil.createFile();
//        FileUtil.writeIntoFile("Gio Dugladze");


//        Davaleba #5

//        XmlUtil.createXML();
    }
}