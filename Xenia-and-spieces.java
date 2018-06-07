/**
* Problem link: http://codeforces.com/contest/342/problem/B
**/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static int tPos;
	
	

		public static int mover(int s, int f, int mat[][], int t){
			if((mat[tPos][1]<=s)&&(mat[tPos][2]>=s)&&(mat[tPos][0]==t)){
				 tPos++;
				 return 0;}
			else{
			if(mat[tPos][0]!=t){
				if(s<f) return (1);
				else return(-1);
			}
			else {
				
				 if((s<f)&&(mat[tPos][1]!=s)&&(mat[tPos][2]!=s+1)&&(mat[tPos][2]!=s)&&(mat[tPos][1]!=s+1)){
					 tPos++;
					 return 1;
				 }
				 else { if((s>f)&&(mat[tPos][1]!=s)&&(mat[tPos][2]!=s-1)&&(mat[tPos][2]!=s)&&(mat[tPos][1]!=s-1)){
					 tPos++;
					 return -1;
				 }
				 else {
					 tPos++;
					 return 0;
				 }
					 
				 }
			}
		}
		}
		
		
	

	public static void main(String[] args) {

		int n,m,s,f;
		BufferedReader br;
		Scanner sc=new Scanner(br=new BufferedReader(new InputStreamReader(System.in)));
		n=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		f=sc.nextInt();
		
		int t=1;
		tPos=1;
		//ArrayList<Vec> mat=new ArrayList<Vec>();
		int mat[][]=new int[m +2][3];
		for(int i=1;i<m + 1;i++){
			mat[i][0]=sc.nextInt();
			mat[i][1]=sc.nextInt();
			mat[i][2]=sc.nextInt();
		}
		while(s!=f){
			int res = mover(s,f,mat,t);
			if(res==1){
				System.out.print('R');
				s++;
			}
			else{
				if(res==-1){
					System.out.print('L');
					s--;}
				else { System.out.print('X');
				}
				
			}
			t++;
		}
	}
//anda esto loco!
}
