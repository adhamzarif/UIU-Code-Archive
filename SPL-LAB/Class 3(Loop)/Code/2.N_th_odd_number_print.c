#include <stdio.h>

int main() {
  int N;
  scanf("%d", &N);
  for (int i = 1, count = 1; i <= N; i++) {
    printf("%d", count);
    count += 2;

    if (i < N) {
      printf(", ");
    }
  }
  return 0;
}
