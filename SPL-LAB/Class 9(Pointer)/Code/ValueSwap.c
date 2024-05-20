#include <stdio.h>
void passByValue(int x, int y) {
  int temp = x;
  x = y;
  y = temp;
}
void passByReference(int *x, int *y) {
  int temp = *x;
  *x = *y;
  *y = temp;
}
int main(void) {
  int x = 10;
  int y = 20;

  passByValue(x, y);
  printf("After passByValue: x = %d, y = %d\n", x, y);

  passByReference(&x, &y);
  printf("After passByReference: x = %d, y = %d\n", x, y);
  return 0;
}
