package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println(fib(9));

        ArrayList<String> onlineMart = new ArrayList<>();

        onlineMart.add("Flipkart");
        onlineMart.add("PepperFry");
        onlineMart.add("Snapdeal");
        onlineMart.add("Myntra");
        onlineMart.add("Amazon");
        onlineMart.add("Shop Clues");
        onlineMart.add("Jabong");

        TreeSet<String> ts = new TreeSet<>(onlineMart);

        Iterator<String>  sorting = ts.iterator();
        while(sorting.hasNext()) {
            System.out.println(sorting.next());
        }

        TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });


        ts2.addAll(onlineMart);

        Iterator<String>  sorting2 = ts2.iterator();
        while(sorting2.hasNext()) {
            System.out.println(sorting2.next());
        }

    }

    static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else
           return n * factorial(n-1);
    }

    // f(n) = f(n-1) + f(n-2)
    // n=0 0
    // n=1 1
    static int fib(int n) {
        if(n==0 || n==1)
            return 1;
              else
            return fib(n-1) + fib(n-2);
    }

}
