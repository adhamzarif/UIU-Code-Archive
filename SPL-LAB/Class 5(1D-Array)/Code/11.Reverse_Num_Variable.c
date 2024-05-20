#include <stdio.h>
int main() {
  int N, i;
  scanf("%d", &N);
  int arr[N], B[N];
  for (i = 0; i < N; i++) {
    scanf("%d", &arr[i]);
  }
  for (i = 0; i < N; i++) {
    B[i] = arr[N - 1 - i];
  }
  printf("Array A : ");
  for (i = 0; i < N; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");
  printf("Array B : ");
  for (i = 0; i < N; i++) {
    printf("%d ", B[i]);
  }
  return 0;
}
