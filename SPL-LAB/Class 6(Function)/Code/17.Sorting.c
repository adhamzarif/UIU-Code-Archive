#include <stdio.h>
void sort_num(int n, int a[]) {
  int i, j, temp;
  for (i = 0; i < n - 1; i++) {
    for (j = 0; j < n - 1; j++) {
      if (a[j] > a[j + 1]) {
        temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
      }
    }
  }
}
int main() {
  int N, i, j;
  scanf("%d", &N);
  int arr[N];
  for (i = 0; i < N; i++) {
    scanf("%d", &arr[i]);
  }
  printf("After Sorting: ");
  sort_num(N, arr);
  for (i = 0; i < N; i++) {
    printf("%d ", arr[i]);
  }
  return 0;
}
