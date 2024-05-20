#include <stdio.h>

int main(void) {
  int num;
  printf("Enter a number: ");
  scanf("%d", &num);
  if((num %4 ==0 & num % 100 != 0) || (num % 400 == 0))
  {
    printf("leap year");
  }
  else
  {
    printf("not a leap year");
  }
  return 0;
}
