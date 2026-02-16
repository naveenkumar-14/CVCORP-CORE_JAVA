public class Question3 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i>5){
                try{
                    Thread.sleep(2000);
                }catch(Exception e){

                }
                
            }
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Question3 q=new Question3();
        q.start();
    }
}
