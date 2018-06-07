/**
* Problem link: http://codeforces.com/contest/219/problem/A
* Date: 2014-08-01
**/

import java.util.*;
import java.util.Set;
public class Main {


	public static int contar(String pal, char l){
		int con=0;
		for (int i=0;i<pal.length();i++){
			if(pal.charAt(i)==l){
				con++;
			}
		}
		return con;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Set letras= new HashSet();
	String palabra;
	int k=sc.nextInt();
	palabra=sc.next();
	
	for(int i=0;i < palabra.length();i++){
		letras.add(palabra.charAt(i));

	}

	Iterator  it = letras.iterator();
	
	int vec[]=new int[letras.size()];
	char vec2[]=new char[letras.size()];

	int jj=0;
	int cantidad=0;
	while(it.hasNext()){
	  char element = (Character) it.next();
	  
	  vec[jj] = contar(palabra,element);
	  //System.out.print(vec[jj]);
	  vec2[jj]=element;
	  //System.out.print(vec2[jj]);
	  jj++;
	}
	int j=0;
	String palaa="";
	
	boolean flag=true;
	while(j<jj){
		if((vec[j]%k)==0){
			for(int i =0;i< vec[j]/k;i++){
				palaa+=vec2[j];
			}
			
		}
		else flag=false;
		
		j++;
		
	}
	
	
	
		if(!flag){
			System.out.print(-1);
		}
		else{
			for(int i =0;i<k;i++){
				System.out.print(palaa);
			}
			
		}
	}

}
