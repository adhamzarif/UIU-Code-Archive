#include <stdio.h>

int main() {
  int N, i;
  scanf("%d", &N);

  int sum = 0;
  for (i = 1; i <= N; i++) {
    if (i % 2 == 1) { // odd term
      sum += i;
    } else { // even term
      sum -= i;
    }
  }

  printf("%d\n", sum);

  return 0;
}
