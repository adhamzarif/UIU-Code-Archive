#include <stdio.h>

int main() {
  int n, i;
  long long sum = 0, term = 0;

  printf("Enter an integer number: ");
  scanf("%d", &n);

  for (i = 1; i <= n; i++) {
    term = term * 10 + i;
    sum += term;
  }

  printf("%lld\n", sum);

  return 0;
}
