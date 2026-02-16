interface Problem1A{
    void m1(char c);
    int m2(int n);
    default int m4(){
        return 10;
    }
}