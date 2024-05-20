#include <stdio.h>

int main(void) {
  int i, j, n;
  scanf("%d", &n);
  for (i = 1; i <= n; i++) {
    int a = i;
    for (j = 1; j <= n; j++) {
      printf("%d", a);
      a++;
    }
    printf("\n");
  }
  return 0;
}
