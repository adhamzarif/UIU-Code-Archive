#include <stdio.h>
int even_odd(int x) {
  if (x % 2 == 0) {
    return 1;
  } else {
    return 0;
  }
  return x;
}
int main(void) {
  int m;
  scanf("%d", &m);
  if (even_odd(m) == 1) {
    printf("even");
  } else {
    printf("odd");
  }
  return 0;
}
