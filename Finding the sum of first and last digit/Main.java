#include <stdio.h>
int main() {
  int num;
	//Type your code
  scanf("%d",&num);
  int a = num % 10;
  while (num>10)
  {
    num = num/10;
  }
  int b = num % 10;
  int c =a + b;
  printf("%d",c);
	return 0;
}