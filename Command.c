#include<stdio.h>
#include<stdlib.h>

int main(int argc, char*argv[])//secont arg is array of char pointer
 {
  int ans = 0;
  printf("name of executable is : %s\n",argv[0]);
  printf("number of command line arguments are: %d\n",argc);
  
 
  ans = atoi(argv[1]) + atoi(argv[2]);  //asci to integer
   printf("Addition is : %d\n",ans);


  return 0;

 }

//gcc Command./c -o Myexe
//./Myexe 11 21