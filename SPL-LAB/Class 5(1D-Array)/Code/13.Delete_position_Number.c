#include <stdio.h>

int main() {
  int arr[100]; // Maximum size set to 100
  int n, position;

  printf("Enter the number of elements: ");
  scanf("%d", &n);

  printf("Enter %d integer numbers:\n", n);
  for (int i = 0; i < n; ++i) {
    scanf("%d", &arr[i]);
  }

  printf("Enter the position of the number to delete (0-indexed): ");
  scanf("%d", &position);

  // Deleting the element at the specified position
  for (int i = position; i < n - 1; ++i) {
    arr[i] = arr[i + 1];
  }
  n--;

  printf("Array after deleting element at position %d:\n", position);
  for (int i = 0; i < n; ++i) {
    printf("%d ", arr[i]);
  }
  printf("\n");

  return 0;
}
