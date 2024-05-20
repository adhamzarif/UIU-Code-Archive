#include <stdio.h>
int gt_lt(int x, int y) {
  if (x > y) {
    return 1;
  } else if (x < y) {
    return 2;
  } else {
    return 0;
  }
  return x, y;
}
int main(void) {
  int m, n;
  scanf("%d %d", &m, &n);
  if (gt_lt(m, n) == 1) {
    printf("%d is greater than %d\n", m, n);
  } else if (gt_lt(m, n) == 2) {
    printf("%d is less than %d\n", m, n);
  } else {
    printf("%d is equal to %d\n", m, n);
  }
  return 0;
}
