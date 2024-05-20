#include <stdio.h>
int fact_cal(int n) {
  int i, fact = 1;
  for (i = 1; i <= n; i++) {
    fact = fact * i;
  }
  return fact;
}
int main(void) {
  int n, fact;
  printf("Enter the number\n");
  scanf("%d", &n);
  fact = fact_cal(n);
  printf("%d\n", fact);
  return 0;
}
