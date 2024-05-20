#include <stdio.h>
int min_check(int a[], int n) {
  int i, min = a[0];
  for (i = 1; i < n; i++) {
    if (a[i] < min) // 10 20 30
    {
      min = a[i];
    }
  }
  return min;
}
int main(void) {
  int numb, i, result = 0;
  scanf("%d", &numb);
  int num[numb];
  for (i = 0; i < numb; i++) {
    scanf("%d", &num[i]);
  }
  result = min_check(num, numb);
  printf("Minimum Value: %d", result);
  return 0;
}
