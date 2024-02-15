import java.util.*;
public class Matrix1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M value: ");
        int m = sc.nextInt();
        System.out.print("Enter N value: ");
        int n = sc.nextInt();
        int m1[][] = new int[m][n];
        int m2[][] = new int[m][n];
        int result[][] = new int[m][n];
        System.out.println("Enter Elements of M1 matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements of M2 matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Result: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=(m1[i][j]+m2[i][j]);
                System.out.print(result[i][j]+" ");
            }
        }
    }
}