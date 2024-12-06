import java.util.*;
public class Lab204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valueNumberX,valueNumberY;
        int sumValue;
        System.out.print("Input value of X : ");
        valueNumberX = input.nextInt();
        sumValue = valueNumberX;
        System.out.print("Input value of Y : ");
        valueNumberY = input.nextInt();
        while (valueNumberX>valueNumberY){
            System.out.print("Input value of Y, again : ");
            valueNumberY = input.nextInt();
        }
        for (int i = valueNumberX+1;i<=valueNumberY;i++){
            System.out.println();
            System.out.print(sumValue+" + "+i+" = "+(sumValue+i));
            sumValue = sumValue+i;
        }
    }
}
