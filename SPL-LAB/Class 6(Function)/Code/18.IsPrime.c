#include <stdio.h>
int is_prime(int x) {
  int flag = 1, i;
  for (i = 2; i < x; i++) {
    if (x % i == 0) {
      flag = 0;
      break;
    }
  }
  return flag;
}
int main() {
  int num;
  scanf("%d", &num);

  if (is_prime(num) == 1) {
    printf("Prime");
  } else {
    printf("Not Prime");
  }
  return 0;
}
