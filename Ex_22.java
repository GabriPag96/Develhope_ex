public class Ex_22 {
    public static void main(String[] args){
        int numMax = 10;
        numLoop(numMax);
    }
    public static void numLoop(int numMax){
        for (int num = 0; num <= numMax; num++){
            if (num == 5){continue;}
            System.out.println(num);
        }
    }
}
