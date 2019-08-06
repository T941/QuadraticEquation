import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");;
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        System.out.println();
Account account =new Account(a,b,c);
double delta=account.getDiscriminant();
if (delta>=0){
    System.out.println("r1 = "+account.getRoot1()+"\t"+"r2 = "+account.getRoot2());
}else{
    System.out.println("The equation has no roots");
}

    }
}
