//convert procedural to genric....
#include<iostream>
using namespace std;

template <class T>
class Arithematic
{
 public:
    T No1;
	T No2;
	
    Arithematic(T a, T b)
	{
	 No1 = a;
	 No2 = b;
	
	}
	
	T Addition()
	{
	 //T ans = 0; //dont initialize any template variable with value
	 T ans;
	 ans = No1 + No2;
	 return ans;
	}
	
	T Subtraction()
	{
	 T ans ;
	 ans = No1 - No2;
	 return ans;
	}
	
};

int main()
{  //obj crearte krtana sang T ky ahe ...he compiler krnare
	Arithematic <int>iobj(10,11);
	int ret = iobj.Addition();
	cout<<"Addition is :"<<ret<<"\n";
	
	Arithematic <double>dobj(10.9,11.5);
	double dret = dobj.Addition();
	cout<<"Addition is :"<<dret<<"\n";
	
	
	return 0;
}
//template instantiation: separate class 4 each datatype.
//every genric program gets converted into specific program by compiler.
//text section vadhto memry