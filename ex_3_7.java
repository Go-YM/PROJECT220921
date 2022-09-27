import java.util.Scanner;

public class ex_3_7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int Array[] = new int[5];

        int max = 0;
        System.out.println("양수 5개를 입력하세요.");
        for(int i=0;i<5;i++)
        {
            Array[i] = scanner.nextInt();
            if(Array[i]>max)
            {
                max = Array[i];
            }
        }
        System.out.print("가장 큰 수는 "+max+"입니다.");

        scanner.close();
    }
}
