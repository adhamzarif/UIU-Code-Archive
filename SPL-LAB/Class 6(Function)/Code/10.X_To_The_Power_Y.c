#include <math.h>
#include <stdio.h>
int power_num(int x, int y) {
  int result = pow(x, y);
  return result;
}
int main(void) {
  int num1, num2;
  scanf("%d %d", &num1, &num2);
  int answer = power_num(num1, num2);
  printf("%d to the power %d is: %d", num1, num2, answer);
  return 0;
}
