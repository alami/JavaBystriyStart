package javabystriystart;
import javabystriystart.HF01strategy.HF01strategy;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList; 
import java.io.*;

public class JavaBystriyStart {
    public static void main(String[] args) {     
//        start();
//        FileHandlingDemo.start();                
//        LambdaDemo.start();
        HF01strategy.start();
    }
    public static void start() {
//,50        4.1.1. String
// String входит в пакет java.lang, который импортируется по умолчанию
        String fullSubstring = "Java: Bystriy Start";
        String firstSubstring = fullSubstring.substring(6);
        String[] splitNames = fullSubstring.split(" ");
        System.out.println("Java: Bystriy Start");
        System.out.println(firstSubstring.substring(0, 8));        
        System.out.println(splitNames[0] + "|" + splitNames[1] + "|" + splitNames[2]);
//,55        4.2 Arrays
// import java.util.Arrays; - все методы класса являются статическими
        int[] userAge = {31, 22, 23, 24, 25}; // int userAge[];
        Arrays.sort(userAge);
        System.out.println(Arrays.toString(userAge));
        System.out.println(Arrays.toString(splitNames));
//,62 всего 8 примитивных типов (byte, short, int, long, float, double, char и boolean),
//   остальные типы являются ссылочными (строки и массивы),
//,64 в Java (и многих других языках) строки неизменяемы.
//   когда вы обновляете переменную String, на самом деле вы создаете новую строку
//   и присваиваете ее адрес в памяти переменной String.
//  старая со временем уничтожена уборкой мусора,

/*Scanner input = new Scanner(System.in);
int myInt;
System.out.printf("Pls,input int: ");
    try {
        myInt = input.nextInt();
    } catch (Exception e) {
        System.out.println(e.getMessage());
        myInt=0;
    }
input.nextLine(); // //читает весь ввод,который не был поглощен ранее
System.out.printf("Pls,input str: ");
String myString = input.nextLine();
System.out.printf("You entered\"%d\" and \"%s\".%n%n", myInt, myString);*/

for (String s: splitNames) System.out.printf("--%s%n",s);
//throw new ArrayIndexOutOfBoundsException();
    
//,172 9.1. JAVA COLLECTIONS FRAMEWORK
//,173 классы-обертки для каждого примитивного типа c авто-упаковкой и распаковкой.    
// Список - похож на массив, но гибче - размер изменяем, т.е.    
// реализующих интерфейс List,чаще всего используются ArrayList и LinkedList.
ArrayList<Integer> userAgeList = new ArrayList<>();
userAgeList.add(40);
userAgeList.add(53);
userAgeList.add(45);
userAgeList.add(53);
        System.out.println(userAgeList);
LinkedList<String> userNameList = new LinkedList<>();
userNameList.add("Hello");
userNameList.add("Good");
userNameList.add("Morning");
userNameList.add(1,"World");
         System.out.println(userNameList);

//193, 10.Операции с файлами. 
//File -переименования и удаления файлов, ,
//FileReader и FileWriter - ИЗ ТЕКСТОВОГО ФАЙЛА.
//BufferedReader,BufferedWriter - более эффективном, 
//читает блок большего размера для ускорения процесса.
//(напоминает буферизацию видеоданных при просмотре видеороликов)

//,205 11. Обобщения по-зволяют создавать классы (такие, как класс ArrayList),
//интерфейсы и методы, рабочий тип данных которых задается параметром в <>.
//работают только с ссылочным, а не примитивными, типами
//MyGenericsClass<Integer> g = new MyGenericsClass<>();
MyGenericsClass g = new MyGenericsClass();
g.setMyVar(6);     g.printValue();
g.setMyVar(6.1);   g.printValue();
g.setMyVar("Java");g.printValue();

MyGenericsClass<Double> g1 = new MyGenericsClass<>();
g1.setMyVar(6.1);  g1.printValue();

MyGenericsClass<String> g2 = new MyGenericsClass<>();
g2.setMyVar("Java");g2.printValue();

//,210 обобщенный класс, ограничения передаються в параметре-типе.
//напр.,работает только с числами класса Number(Integer/Double его производные)
MyGenericsClass2 g3 = new MyGenericsClass2();
g3.setMyVar(6.);    g3.printValue();
//g3.setMyVar("Java");g3.printValue();

//,211 Функциональный интерфейс — содержит только один абстрактный метод.
//он и определяет его предполагаемое предназначение
//как использовать лямбда-выражения для реализации их?
//1)объявить ссылку на каждый из функциональных интерфейсов
//(Напомню, что экземпляры интерфейсов создавать нельзя!):
MyNumber num1;
MyNumberPara num2;
//2)присваивать им лямбда-выражения.
   }
}

class MyGenericsClass<T>{
    private T myVar;
    void setMyVar (T i){ myVar = i; }
    void printValue(){System.out.println("The value of myVar is " +myVar);
}   }
class MyGenericsClass2 <T extends Number>{
    private T myVar;
    void setMyVar (T i){ myVar = i; }
    void printValue(){System.out.println("The value of myVar is " +myVar);
}   }

@FunctionalInterface
interface MyNumber {double getValue();}
@FunctionalInterface
interface MyNumberPara{ double getValue2(int n, int m);
}
