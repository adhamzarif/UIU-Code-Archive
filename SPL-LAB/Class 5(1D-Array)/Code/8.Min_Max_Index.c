#include <stdio.h>
int main() {
  int N, min = 0, max = 0;
  scanf("%d", &N);
  int arr[N];
  for (int i = 0; i < N; i++) {
    scanf("%d", &arr[i]);
  }
  for (int i = 0; i < N; i++) {
    if (arr[max] < arr[i])
      max = i;
    else if (arr[min] > arr[i])
      min = i;
  }
  printf("Max: %d Index: %d\n", arr[max], max);
  printf("Min: %d Index: %d\n", arr[min], min);
  return 0;
}
