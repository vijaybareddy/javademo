package org.example.demo;

public class AddTest {

    public static void main(String[] args) {
        Add add= new Add();
       int result= add.addition();
        System.out.println("result is : "+result);
        Add sub =new Add();
       int resltsub= sub.sub();
       System.out.println(resltsub);
    }
}
