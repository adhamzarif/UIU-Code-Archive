#include <stdio.h>

int main(void) {
  int i, j, k, n;
  printf("Enter value: ");
  scanf("%d", &n);

  for (i = 1; i <= n; i += 2) {
    for (j = n; j >= i; j -= 2) {
      printf("_");
    }
    for (k = 1; k <= i; k++) {
      printf("*");
    }
    printf("\n");
  }

  // Reverse
  for (i = n - 2; i > 0;
       i -= 2) { // 1 will be n-2, i <= n will be i > 0, + will be -
    for (j = n; j >= i; j -= 2) {
      printf("_");
    }
    for (k = 1; k <= i; k++) { // no change
      printf("*");
    }
    printf("\n");
  }

  return 0;
}
