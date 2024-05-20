#include <stdio.h>

int main(void) {
  int num;
  scanf("%d", &num);
  int ar[num];
  for (int i = 0; i < num; i++) {
    scanf("%d", &ar[i]);
  }
  for (int i = num - 1; i >= 0; i--) {
    printf("%d ", ar[i]);
  }
  return 0;
}
