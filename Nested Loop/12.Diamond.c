#include <stdio.h>

int main(void) {
  int i, j, k, num;
  printf("Enter a number: ");
  scanf("%d", &num);

  // UpperPart
  for (i = 1; i <= num / 2 + 1; i++) {
    for (j = 1; j <= num / 2 + 1 - i; j++) {
      printf("_");
    }
    for (k = 1; k <= 2 * i - 1; k++) {
      printf("*");
    }
    printf("\n");
  }

  // LowerPart
  for (i = 1; i <= num / 2; i++) {
    for (j = 1; j <= i; j++) {
      printf("_");
    }
    for (k = 1; k <= num - 2 * i; k++) {
      printf("*");
    }
    printf("\n");
  }
  return 0;
}
