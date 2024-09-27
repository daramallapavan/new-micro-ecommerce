package com.example.DesignPatterns.markerinterface;

public class DaoFramework {


    public void delete(Product product){
        if (product instanceof  Deletable){

            System.out.println(" product is instance of deletable");
        }else{
            System.out.println(" product is  not instance of deletable");
        }
    }

    public static void main(String[] args) {
        DaoFramework daoFramework=new DaoFramework();
        daoFramework.delete( new Product());
    }
}
