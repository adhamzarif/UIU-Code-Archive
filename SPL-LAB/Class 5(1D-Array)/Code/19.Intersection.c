#include <stdio.h>

int main() {
  int n, m;

  // Input size of array A
  printf("Enter the size of array A: ");
  scanf("%d", &n);

  // Input elements of array A
  int A[n];
  printf("Enter %d integers for array A: ", n);
  for (int i = 0; i < n; i++)
    scanf("%d", &A[i]);

  // Input size of array B
  printf("Enter the size of array B: ");
  scanf("%d", &m);

  // Input elements of array B
  int B[m];
  printf("Enter %d positive integers for array B: ", m);
  for (int i = 0; i < m; i++)
    scanf("%d", &B[i]);

  // Print intersection of arrays A and B
  printf("Intersection of arrays A and B: ");
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if (A[i] == B[j]) {
        printf("%d ", A[i]);
        break;
      }
    }
  }
  printf("\n");

  return 0;
}
