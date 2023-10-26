public class Ex_16 {
    public static void main(String[] args ){

        int dayNum = 5;
        dayCount(dayNum);
    }
    public static void dayCount(int dayNum){
        switch (dayNum){
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Wrong daynumber. Please select a number from 1 to 7.");
        }
    }
}
