#include <stdio.h>

int main() {
  int arr[100]; // Maximum size set to 100
  int n, position, num;

  printf("Enter the number of elements: ");
  scanf("%d", &n);

  printf("Enter %d integer numbers:\n", n);
  for (int i = 0; i < n; ++i) {
    scanf("%d", &arr[i]);
  }

  printf("Enter the position to insert the number (0-indexed): ");
  scanf("%d", &position);

  printf("Enter the number to insert: ");
  scanf("%d", &num);

  // Shift elements to the right to make space for the new number
  for (int i = n; i > position; --i) {
    arr[i] = arr[i - 1];
  }

  // Insert the number at the specified position
  arr[position] = num;

  printf("Array after inserting %d at position %d:\n", num, position);
  for (int i = 0; i < n + 1; ++i) {
    printf("%d ", arr[i]);
  }
  printf("\n");

  return 0;
}
