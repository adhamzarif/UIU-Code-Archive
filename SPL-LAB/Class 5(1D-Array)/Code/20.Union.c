#include <stdio.h>

int main() {
  int n, m;
  printf("Enter the number of elements in array A: ");
  scanf("%d", &n);
  printf("Enter the elements of array A: ");
  int A[n];
  for (int i = 0; i < n; i++) {
    scanf("%d", &A[i]);
  }

  printf("Enter the number of elements in array B: ");
  scanf("%d", &m);
  printf("Enter the elements of array B: ");
  int B[m];
  for (int i = 0; i < m; i++) {
    scanf("%d", &B[i]);
  }

  printf("Union of arrays A and B: ");

  // Traverse array A
  for (int i = 0; i < n; i++) {
    printf("%d ", A[i]);
  }

  // Traverse array B and print elements not present in A
  for (int i = 0; i < m; i++) {
    int found = 0;
    for (int j = 0; j < n; j++) {
      if (B[i] == A[j]) {
        found = 1;
        break;
      }
    }
    if (!found) {
      printf("%d ", B[i]);
    }
  }

  return 0;
}
