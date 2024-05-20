#include <stdio.h>
int sum_a(int a[], int n) {
  int i, sum = 0;
  for (i = 0; i < n; i++) {
    sum += a[i];
  }
  printf("Sum In Function: %d\n", sum);
  return sum;
}
int main(void) {
  int m, n, i;
  scanf("%d", &n);
  int a[n];
  for (i = 0; i < n; i++) {
    scanf("%d", &a[i]);
  }
  printf("Sum In Main: %d\n", sum_a(a, n));
  return 0;
}
