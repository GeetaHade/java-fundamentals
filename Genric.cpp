
#include<iostream>
using namespace std;

template <class T>
T Addition(T no1, T no2)
{
	T Ans = 0;
	Ans = No1 + No2;
	return Ans;
}

int main()
{
	int x =10, y = 11, ret =0;
	ret Addition(x,y);
	cout<<"Addition id:"<<ret<<"\n";
	
	float a=10.8, b = 11.5, fret = 0.0;
	fret = Addition(a,b);
	cout<<"Addition id:"<<fret<<"\n";
	
	double d1=17.8, d2 = 19.5, dret = 0.0;
	dret = Addition(d1,d2);
	cout<<"Addition id:"<<dret<<"\n";
	
	
	
	return 0;
}