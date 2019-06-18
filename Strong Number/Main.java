#include <stdio.h>
int main() {
	//Type your code
  int num,a,b;
  int sum=0;
  scanf("%d",&num);
  b=num;
  while(b!=0)
  {
    a=b%10;
    int mul=1;
    for(int i=1;i<=a;i++)
    {
      mul*=i;
    }
    sum=sum+mul;
    b=b/10;
  }
   if(sum==num)
     printf("Yes");
  else
    printf("No");
	return 0;
}