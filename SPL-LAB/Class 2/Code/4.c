#include <stdio.h>

int main(void) {
  int num1, num2, num3;
  printf("Enter a numbers: ");
  scanf("%d %d %d", &num1, &num2, &num3);
  if( (num1 > 0) && (num1 < 180))
  {
    printf("Yes");
  }
  else if( (num2 > 0) && (num2 < 180))
    {
      printf("Yes");
    }
  else if( (num3 > 0) && (num3 < 180))
    {
      printf("Yes");
    }
  else
  {
    printf("No");
  }
  return 0;
}
