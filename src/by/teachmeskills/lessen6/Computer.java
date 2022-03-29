package by.teachmeskills.lessen6;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String cpu="i7 720QM";
    String ram="8 GB";
    String hdd="500 GB";
    int cycleResource=3;
    int count;

    public static void main(String[] args) {

    Computer comp=new Computer();
    comp.out();
    comp.inclusion();
    comp.shutdown();
        for (int i = 0; i < comp.cycleResource; i++) {
            comp.inclusion();
            comp.shutdown();
        if(comp.count/2== comp.cycleResource){
            System.out.println("Компьютер сгорел! ");
        }

        }
    }

    void out(){
        System.out.println("Существующий компьютер имеет параметры: процессор-"+cpu+", оперативная память-"+ram+", жесткий диск-"+hdd+" и количество циклов вкл/выкл-"+cycleResource+".");
    }

    boolean inclusion(){
        int random;
        int vvod;
        boolean vkl=false;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        random=r.nextInt(1);

        while (true){
            System.out.println("Для включения компьютера введите 0 или 1");
            vvod = sc.nextInt();
            if(vvod<0||vvod>1){
                System.out.println("Введено неверное число! Попробуйте еще раз!");
            }else{
                break;
            }
        }
        if(random==vvod){
            System.out.println("Компьютер включен! ");
            count++;
            return true;
        }else {
            System.out.println("Компьютер сгорел! ");
            return false;
        }
    }


    boolean shutdown(){

        int random;
        int vvod;
        boolean vikl=false;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        random=r.nextInt(1);

        while (true){
            System.out.println("Для выключения компьютера введите 0 или 1");
            vvod = sc.nextInt();
            if(vvod<0||vvod>1){
                System.out.println("Введено неверное число! Попробуйте еще раз!");
            }else{
                break;
            }
        }
        if(random==vvod){
            System.out.println("Компьютер выключен! ");
            count++;
            return true;
        }else {
            System.out.println("Компьютер сгорел! ");
            return false;
        }
    }
}
