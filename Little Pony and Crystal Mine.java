/**
* Problem link: http://codeforces.com/contest/454/problem/A
**/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		BufferedReader br;
		Scanner sc=new Scanner(br=new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
		String linea="";
		int mitad = (n-1)/2;
		char mat[][]= new char[n][n];
		int y=0;
		int x=0;
		while(y<=mitad){
			x=mitad-y;
			while (x <= mitad + y){
				mat[x][y]='D';
				x++;
			}
			y++;
		}
		/*while(y < n){
			x=n-y;
			while(x<=mitad ){
				mat[x][y]='D';
				x++;
			}
			y++;
		}*/
		//while(y==mitad)
		for(int i=0;i<mitad;i++){
			
			for(int j=0;j<n;j++){
				if((mat[j][i]=='D'))
					linea=linea + 'D';
				else
					linea=linea + '*';
				
				
					
				
			}
			
				
			System.out.println(linea);
			linea="";
		}
for(int i=mitad;i>=0;i--){
			
			for(int j=0;j<n;j++){
				if((mat[j][i]=='D'))
					linea=linea + 'D';
				else
					linea=linea + '*';
				
				
					
				
			}
			
				
			System.out.println(linea);
			linea="";
		}
		
	}

}
