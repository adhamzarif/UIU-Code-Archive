#include <math.h>
#include <stdio.h>
int main() {
  int x, y;
  double result;

  // Input
  printf("Enter values for x and y (separated by a space): ");
  scanf("%d %d", &x, &y);

  // Check if x and y are non-negative
  if (x < 0 || y < 0) {
    printf("Invalid input. Make sure x and y are non-negative.\n");
  } else {
    // Calculate x^y using pow function
    result = pow(x, y);

    // Output
    printf("%.0f\n", result);
  }

  return 0;
}
