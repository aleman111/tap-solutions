/**
* Problem Link: http://codeforces.com/contest/58/problem/A
* Date: 2018-07-29
**/

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String palabra = sc.next();
		int estado=0;
		if(palabra.length()>4){
			for(int i=0;i<palabra.length();i++){
				if((estado==0)&&(palabra.charAt(i)=='h')){
					estado=1;
				}
				if((estado==1)&&(palabra.charAt(i)=='e')){
					estado=2;
				}
				if((estado==2)&&(palabra.charAt(i)=='l')){
					estado=8;
				}
				if((estado==3)&&(palabra.charAt(i)=='l')){
					estado=4;
				}
				if((estado==4)&&(palabra.charAt(i)=='o')){
					estado=5;
				}
				if(estado==8)
					estado=3;
			}
		}
		if(estado==5){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
	}

}
