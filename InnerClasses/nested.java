interface A{
    abstract void m1();
     default void m2(){
        System.out.print("m2 method");
    }
    interface B{
        abstract void m3();
    }
    interface C{
        abstract void m4();
    }
}