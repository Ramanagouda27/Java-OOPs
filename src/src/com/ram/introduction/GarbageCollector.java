package com.ram.introduction;

public class GarbageCollector {
    public static void main(String[] args) {


        GC obj;

        for (int i = 0; i < 1000000000; i++) {

            obj = new GC("Random name");
        }
    }
static class GC{

    public GC(String name){
        System.out.println("Object is created");
    }

    //whenever the objects of the class GC is freed
    // from the memory then the finalize method will be called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed !!");
    }
}

}
