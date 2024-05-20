#include <stdio.h>

int main() {
  int num;
  scanf("%d", &num);
  int flag = 1;
  for (int i = 2; i < num; i++) {
    if (num % i == 0) {
      flag = 0;
      break;
    }
  }
  if (flag == 1) {
    printf("Prime");
  } else {
    printf("Not Prime");
  }
  return 0;
}
