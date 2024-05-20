#include <stdio.h>

int main(void) {
  int i, j, k, n;
  printf("Enter value: ");
  scanf("%d", &n);

  for (i = 1; i <= n; i++) {

    for (j = 1; j <= n - i; j++) {
      printf("_");
    }

    for (k = 1; k <= 2 * i - 1; k++) {
      printf("*");
    }
    printf("\n");
  }
  return 0;
}
