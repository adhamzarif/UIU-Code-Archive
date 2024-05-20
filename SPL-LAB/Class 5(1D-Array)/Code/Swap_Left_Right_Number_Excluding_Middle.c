#include <stdio.h>

int main() {

  int n, i;

  printf("Enter the number of elements: ");
  scanf("%d", &n);
  int arr[n];
  for (i = 0; i < n; i++) {
    scanf("%d", &arr[i]);
  }

  // Swapping left and right elements, excluding the middle element
  for (i = 0; i < n / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
  }

  for (i = 0; i < n; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");

  return 0;
}
