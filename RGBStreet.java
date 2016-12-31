/*
	By: aleman111
	Date:31/12/2016
	Name: RGBStreet
	URL: http://topcoder.bgcoder.com/print.php?id=1395
*/

import java.util.Scanner;


public class RGBStreet {

    static int [][] sDP = new int[20][3];
    static int [][] sHouses = new int[20][3];
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        loadHouses();
        int min = Math.min(getMin(0,0), Math.min(getMin(0, 1), getMin(0, 2)));
        System.out.println(min);
    }
    public static void loadHouses()
    {
        String houseLine = sc.nextLine();
        int cant = 0;
        while(!houseLine.equals(""))
        {
            String [] houseArray = houseLine.split(" ");
            for(int i = 0; i< 3; i++)
            {
                sHouses[cant][i] = Integer.parseInt(houseArray[i]);
            }
            cant++;
            houseLine = sc.nextLine();
        }
    }
    public static int getMin(int pos, int house)
    {
        //Max 20 houses
        if(pos < 20)
        {
            if(sDP[pos][house] == 0)
            {
                if(house == 0)
                {
                    sDP[pos][house] = Math.min(getMin(pos + 1, 1),getMin(pos + 1, 2)) + sHouses[pos][house];
                }
                if(house == 1)
                {
                    sDP[pos][house] = Math.min(getMin(pos + 1, 0),getMin(pos + 1, 2)) + sHouses[pos][house];
                }
                if(house == 2)
                {
                    sDP[pos][house] = Math.min(getMin(pos + 1, 0),getMin(pos + 1, 1)) + sHouses[pos][house];
                }
            }
            return sDP[pos][house];
        }
        return 0;
    }
}
