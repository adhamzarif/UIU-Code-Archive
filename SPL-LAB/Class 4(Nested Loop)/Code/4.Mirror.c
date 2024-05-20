#include <stdio.h>

int main(void) {

  int i, j, k, n;
  scanf("%d", &n);

  for (i = 1; i <= n; i++) {
    for (j = i; j < n; j++)
      printf("_");
    for (k = 1; k <= i; k++)
      printf("%d", i);
    printf("\n");
  }
  return 0;
}
