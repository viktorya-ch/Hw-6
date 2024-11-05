public class Main {
    public static void main(String[] args){

      //Task#1
        for (int i = 0; i <= 10; i = i + 1){
            System.out.println(i);}

        //Task#2
        for (int i = 10; i >= 0; i = i - 1){
            System.out.println(i);}

        //Task#3
        for(int i = 0; i <= 17; i = i + 2){
            System.out.println(i);}

        //Task#4
        for(int i = 10; i >= -10; i = i - 1){
            System.out.println(i);}

        //Task#5
        for(int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");}

        //Task#6
        for(int i = 7; i <= 98; i = i + 7){
            System.out.println(i);}

        //Task#7
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);}

        //Task#8
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + salary;
            System.out.println(" Месяц " + i + " сумма накоплений равна" + total );}

        //Task#9
        int salary1 = 29000;
        int total1 = 0;
        double percentage = 0.01;
        for(int i = 0; i < 12; i++){
            total1 = total1 + salary1;
            total1 = (int) (total1 * (1 + percentage));
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total1);}
            System.out.println(total1);

        //Task#10
        int t = 0;

        for (int i = 0; i <= 10; i = i + 1){
            t = i * 2;
        System.out.println(" 2 * " + i + " = " + t);}

    }}