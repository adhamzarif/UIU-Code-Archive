#include <stdio.h>
int main() {
  int N, i, j, k;
  scanf("%d", &N);
  int arr[N];
  for (i = 0; i < N; i++) {
    scanf("%d", &arr[i]);
  }
  for (i = 0; i < N; i++) {
    for (j = i + 1; j < N; j++) {
      if (arr[i] == arr[j]) {
        for (k = j; k <= N - 1; k++) {
          arr[k] = arr[k + 1];
        }
        N--;
        j--;
      }
    }
  }
  for (i = 0; i < N; i++)
    printf("%d ", arr[i]);
  return 0;
}
