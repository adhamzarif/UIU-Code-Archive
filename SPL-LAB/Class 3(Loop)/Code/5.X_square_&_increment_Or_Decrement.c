#include <stdio.h>
int main() {
  int X, Y;
  printf("Enter two numbers (X and Y): ");
  scanf("%d %d", &X, &Y);
  int square = X * X;
  printf("%d,", square);
  for (; X != Y;) {
    if (X < Y) {
      X = X + 1;
    } else {
      X = X - 1;
    }
    square = X * X;
    printf("%d,", square);
  }
  printf("Reached!\n");
  return 0;
}
