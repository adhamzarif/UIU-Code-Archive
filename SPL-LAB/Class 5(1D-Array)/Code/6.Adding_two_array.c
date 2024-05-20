#include <stdio.h>
int main() {
  int N, i;
  scanf("%d", &N);
  int arr1[N], arr2[N];
  for (i = 0; i < N; i++) {
    scanf("%d", &arr1[i]);
  }
  for (i = 0; i < N; i++) {
    scanf("%d", &arr2[i]);
  }
  for (i = 0; i < N; i++) {
    printf("%d", arr1[i] + arr2[i]);
  }
  return 0;
}
