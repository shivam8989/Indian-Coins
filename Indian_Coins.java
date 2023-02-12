package Greedy_Algorithim;
import java.util.*;
public class Indian_Coins {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Integer coins [] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countCoins = 0;
        System.out.println("Enter the Amount");
        int amount = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countCoins++;
                    ans.add(coins[i]);
                    amount = amount-coins[i];
                }
            }
        }
        System.out.println("Total minimum coins is used = "+countCoins);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

    }
}
