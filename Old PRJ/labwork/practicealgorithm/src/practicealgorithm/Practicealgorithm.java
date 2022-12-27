/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicealgorithm;

/**
 *
 * @author duynh
 */
import java.util.*;

public class Practicealgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n,k,x;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();
        int []display = new int[n];
        display = getlongList(n,k,x);
        for (int i = 0; i < display.length; i++) {
            System.out.print(display[i]+ " ");
        }
    }

    public static int[] getlongList(int n,int k,int x) {
        if (k == n) n ++;
        int []Thisnum = new int[n];
        for (int i = 1; i <= Thisnum.length; i++) {
            Thisnum[i-1] = i;
        }
        
        for (int i = 1; i <= Thisnum.length; i++) {
            Thisnum[k] = Thisnum[k+1];
            Thisnum[k] = x;
            
        }
        
        
        
        return Thisnum;
    }

}
//
//Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. Tiếp theo nhập vào hai số nguyên là k và x (0 ≤ k ≤ n).
//
//Hãy chèn phần tử có giá trị x vào dãy a, ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1. In mảng kết quả ra màn hình, mỗi số cách nhau bởi một khoảng trắng.
