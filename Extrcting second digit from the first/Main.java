#include <stdio.h>
int main() {
  int num;
	//Type your code
  scanf("%d",&num);
  while ( num/10 > 10)
  {
    num = num / 10;
  }
  printf("%d",num%10);
	return 0;
}