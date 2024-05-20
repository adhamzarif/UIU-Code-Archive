#include <stdio.h>

int main() {
  int N, i, search, found = 0;
  scanf("%d", &N);
  int arr[N];

  // Taking input for the array
  for (i = 0; i < N; i++) {
    scanf("%d", &arr[i]);
  }

  // Taking input for the number to search
  scanf("%d", &search);

  // Searching for the number in the array
  for (i = 0; i < N; i++) {
    if (arr[i] == search) {
      found = 1;        // Flag to indicate the number is found
      printf("%d ", i); // Print the index where the number is found
    }
  }

  // If the number is not found, print "NOT FOUND"
  if (!found) {
    printf("NOT FOUND");
  }

  return 0;
}
