#include <stdio.h>
int main() {
  int num;
  int mul=1;
  scanf("%d",&num);
  for(int i=1;i<=num;i++)
  {
    mul=mul*i;
  }
  printf("%d",mul);
    
	//Type your code
	return 0;
}