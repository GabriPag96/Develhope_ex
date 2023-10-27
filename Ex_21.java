public class Ex_21 {
    public static void main(String[] args){
        int numMax = 21;
        numLoop(numMax);
    }
    public static void numLoop(int numMax){
        for (int num = 0; num <= numMax; num++){
            if (num == 5){break;}
            System.out.println(num);
        }
    }
}
