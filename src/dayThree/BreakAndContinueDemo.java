package dayThree;

public class BreakAndContinueDemo {
    static void main() {
        for(int i=1; i<=10;i++)
        {
            if(i==5)
                break;
            System.out.println(i);
        }

        System.out.println("_____________________________");

        for(int i=1;i<=10;i++)
        {
            if (i==3||i==5||i==9)
                continue;
            System.out.println(i);
        }
    }
}
