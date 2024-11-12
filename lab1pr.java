import java.util.Formatter;
import java.util.Scanner;
    public class  lab1pr{
        public static double calculatePoisk(double x,int k)
        {
            double sum=0;
            double term=x;
            int n=1;
            while(Math.abs(term)>=Math.pow(10,-k))
            {
                sum+=term;
                term*=-1*x*x/((2*n)*(2*n+1));
                n++;
            }
           return sum;
        }
public static void main(String args[]) {
    Scanner scanner= new Scanner(System.in);
    Formatter formatter =new Formatter(System.out);
    System.out.println("введите x");
    double x=scanner.nextDouble();
    System.out.println("введите k");
    int k=scanner.nextInt();
    double actualresult=Math.sin(x);
    System.out.printf("результат стандартной функции %7f%n ",actualresult);
    formatter.format("%+.7f%n",actualresult);
    formatter.format("Octal value: %o%n", (int) actualresult);
    formatter.format("Hexadecimal value: %x%n", (int) actualresult); 
    formatter.format("приближенное значение по формуле Тейлора %7f%n",calculatePoisk(x,k));
    System.out.println("форматированное значение к+1 знак после запятой ");
    formatter.format("%."+(k+1)+"f",actualresult);
    System.out.println("  ");
    System.out.print(formatter);
    scanner.close();
    formatter.close();
    }   
    }
