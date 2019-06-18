#include <stdio.h>
int main() {
  int num,a;
  int sum = 0;
	//Type your code
  scanf("%d",&num);
  while (num != 0)
  {
    a = num%10;
    sum = sum + a;
    num = num/10;
  }
   printf("%d",sum) ;
	return 0;
}