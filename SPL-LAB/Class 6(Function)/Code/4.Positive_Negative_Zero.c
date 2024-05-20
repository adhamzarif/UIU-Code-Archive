#include <stdio.h>
int check_input(int x) {
  if (x > 0) {
    return 1;
  } else if (x < 0) {
    return -1;
  } else {
    return 0;
  }
  return x;
}
int main(void) {
  int m;
  scanf("%d", &m);
  if (check_input(m) == 1) {
    printf("positive");
  } else if (check_input(m) == -1) {
    printf("negative");
  } else {
    printf("zero");
  }
  return 0;
}
