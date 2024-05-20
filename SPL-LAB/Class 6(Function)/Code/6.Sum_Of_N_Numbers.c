#include <stdio.h>
int n_check(int num, int sum) {
  sum += num;
  printf("Sum in Function is: %d\n", sum);
  return sum;
}
int main() {
  int number, num1, sum1, result = 0, i;
  scanf("%d", &num1);
  for (i = 0; i < num1; i++) {
    scanf("%d", &number);
  }
  result = n_check(number, result);
  printf("Sum In Main: %d\n", result);
  return 0;
}
