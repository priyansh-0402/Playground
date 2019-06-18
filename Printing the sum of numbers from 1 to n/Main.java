#include <stdio.h>
int main() {
  int n;
  int sum=0;
  scanf("%d",&n);
	//Type your code
  for(int i=0;i<=n;i++)
  {sum = sum + i;
  }
    printf("%d",sum);
	return 0;
}