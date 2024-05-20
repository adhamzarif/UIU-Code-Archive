#include <stdio.h>
int even_check(int a[], int n) {
  int i;
  for (i = 0; i < n; i++) {
    if (a[i] % 2 == 0) {
      return 1;
    }
  }
  return a[i];
}
int main(void) {
  int num, n, i;
  scanf("%d", &n);
  int a[n];
  for (i = 0; i < n; i++) {
    scanf("%d", &a[i]);
    if (even_check(a, n) == 1) {
      if (a[i] % 2 == 0) {
        printf("%d ", a[i]);
      }
    }
  }

  return 0;
}
