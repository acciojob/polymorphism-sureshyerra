package com.driver;

public class Main {

  public static class Product{

        public int product(int x,int y){
            return x*y;


        }
        public int product(int x, int y, int z) {
            return x*y*z;

        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
    Product p = new Product();
    int k1 =p.product(10,40);
    int k2 = p.product(10,40,5);
    double k3 =p.product(10,40,45);
    System.out.println(k1 +" "+k2 + " " + k3);





    }

}