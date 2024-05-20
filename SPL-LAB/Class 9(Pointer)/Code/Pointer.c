#include <stdio.h>

int main(void) {
  int x = 10;
  int *p = &x;

  printf("x's address: %d\n", x);
  printf("value of p: %d\n", p);
  printf("value of *p: %d\n", *p);

  *p = 100;
  printf("change value of x: %d\n", x);
  return 0;
}
