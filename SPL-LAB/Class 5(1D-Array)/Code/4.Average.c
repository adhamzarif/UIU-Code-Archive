#include <stdio.h>
int main() {
  int N, sum = 0;
  scanf("%d", &N);
  int arr[N];
  for (int i = 0; i <= N - 1; i++) {
    scanf("%d", &arr[i]);
    sum = sum + arr[i];
  }

  float avg = 0;
  avg = (float)sum / N;
  printf("Average is %f", avg);
  return 0;
}
