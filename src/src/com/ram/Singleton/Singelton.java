package com.ram.Singleton;

public class Singelton {
    private int num = 0;
    Singelton(){

    }

    private static  Singelton instance;

    public static Singelton getInstance(){
        // check whether 1 obj only is created or not
        if (instance == null){
            instance = new Singelton();
        }
        return instance;
    }

}
