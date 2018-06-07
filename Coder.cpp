/**
* Problem Path: http://codeforces.com/contest/384/problem/A
* Date: 2014-07-28
**/

#include <iostream>
using namespace std;

bool esPar(int n)
	{
		if (n %2 ==0)
		{return true ;}
		else 
			return false;
		
		
	}
int main(int argc, char **argv)
{
	
	int n,cont;

cin >> n;
char matrix[1010][1010];
cont=0;
for (int y=0;y<n ;y++ )
{
    for (int x=0;x<n;x++)
    	
    {
    	if ((esPar(y)==false)&& (esPar(x)==false))
    	{
    		matrix[y][x]='C';
    		cont++;
    	}
    	if ((esPar(y)==false)&&(esPar(x)==true))
    	{
    		matrix[y][x]='.';
    	}
    		

    	if ((esPar(y)==true)&& (esPar(x)==false))
    	{
    		matrix[y][x]='.';
    		
    	}
    	

    	if ((esPar(y)==true)&& (esPar(x)==true))
    	{
    		matrix[y][x]='C';
    		cont++;
    		
    	}
	}
	} 
	cout <<cont<<endl;
	
    	for (int h=0;h<n;h++)
    		 
    	{

        	for (int j=0;j<n;j++)
        		 
        	{
        		cout << matrix[h][j];
        	}
    
    	cout << endl;
	}
	
	
	return 0;
}
