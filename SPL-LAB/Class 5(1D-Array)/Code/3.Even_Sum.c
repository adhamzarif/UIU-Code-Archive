#include <stdio.h>
int main() {
  int N, sum = 0;
  scanf("%d", &N);
  int arr[N];
  for (int i = 0; i <= N - 1; i++) {
    scanf("%d", &arr[i]);
    if (arr[i] % 2 == 0)
      sum = sum + arr[i];
  }

  printf("Sum is: %d", sum);
  return 0;
}
