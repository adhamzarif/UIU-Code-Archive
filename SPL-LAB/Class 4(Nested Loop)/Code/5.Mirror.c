// As Same As 3

#include <stdio.h>

int main(void) {
  int i, j, n;
  scanf("%d", &n);
  for (i = 1; i <= n; i++) {
    int a = n;
    for (j = 1; j <= i; j++) {
      printf("%d ", a);
      a--;
    }
    printf("\n");
  }
  return 0;
}
