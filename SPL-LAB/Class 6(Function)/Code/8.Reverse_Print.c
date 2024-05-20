#include <stdio.h>
int reverse_num(int a[], int n) {
  int i, temp;
  for (i = 0; i < n / 2; i++) {
    temp = a[i];
    a[i] = a[n - 1 - i];
    a[n - 1 - i] = temp;
  }
  return temp;
}
int main(void) {
  int n, i, tp;
  printf("Enter the number of elements in the array\n");
  scanf("%d", &n);
  int a[n];
  printf("Enter the elements of the array\n");
  for (i = 0; i < n; i++) {
    scanf("%d", &a[i]);
  }
  tp = reverse_num(a, n);
  printf("The reversed array is\n");
  for (i = 0; i < n; i++) {
    printf("%d ", a[i]);
  }
  return 0;
}
