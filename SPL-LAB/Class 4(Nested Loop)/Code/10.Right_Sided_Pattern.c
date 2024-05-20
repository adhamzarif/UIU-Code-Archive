#include <stdio.h>

int main(void) {
  int i, j, k, n;
  printf("Enter value: ");
  scanf("%d", &n);
  // outer loop
  for (i = 1; i <= n; i++) {
    // inner loop

    // for space
    for (j = 1; j <= n - i; j++) {
      printf("_");
    }
    // for star
    for (k = 1; k <= i; k++) {
      printf("*");
    }
    printf("\n");
  }
  return 0;
}
