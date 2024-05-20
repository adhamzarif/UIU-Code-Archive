#include <stdio.h>

int main(void) {
  int num1,num2;
  printf("Enter Numbers: ");
  scanf("%d %d",&num1,&num2);
  if(num1 > num2)
  {
    printf("%d is greater than %d",num1,num2);
  }
  else if(num1 < num2)
  {
    printf("%d is less than %d",num1,num2);
  }
  else if(num2 > num1)
    {
      printf("%d is greater than %d",num2,num1);
    }
  else if(num2 < num1)
    {
      printf("%d is less than %d",num2,num1);
    }
  else
  {
    printf("%d is equal to %d",num1,num2);
  }
  return 0;
}
