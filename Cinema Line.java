/**
* Problem Link: http://codeforces.com/contest/349/problem/A
**/

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		long n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextLong();
		int cambio[]=new int[3];
		boolean flag=true;
		for(long i=0;i<n;i++){
			int billete=sc.nextInt();
			if(billete==25){
				cambio[0]++;
			}
			if(billete==50){
				if(cambio[0]>0){
					cambio[0]=cambio[0] - 1 ;
					cambio[1]++;
				}
				else{
					flag=false;
				}
			}
			if(billete==100){
				
					if((cambio[1]>0)&&(cambio[0]>0)){
						cambio[2]++;
						cambio[1]=cambio[1]-1;
						cambio[0]=cambio[0]-1;
					}
					else {
						if(cambio[0]<3){
							flag=false;
						}
						if(cambio[0]>2){
							cambio[0]=cambio[0]-3;
							cambio[2]++;
						}
						
					}
			}
			
		}
		if(flag){
			System.out.print("YES");
		}
		else { 
			System.out.print("NO");
		}
	}

}
