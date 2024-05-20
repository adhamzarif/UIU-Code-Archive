#include <stdio.h>

int main(void) {
  int N;
  double num, sum = 0;
  printf("Enter the number of values: ");
  scanf("%d", &N);
  for (int i = 1; i <= N; i++) {
    printf("Enter value %d: ", i);
    scanf("%lf", &num);
    sum += num;
  }
  printf("Average: %f", sum / N);
  return 0;
}

// #include <stdio.h>

// int main() {
//   int N;
//   scanf("%d", &N);
//   float x, sum = 0;

//   for (int i = 1; i <= N; i++) {
//     scanf("%f", &x);
//     sum += x;
//   }
//   float avg = sum / N;
//   printf("avg of %d inputs: %f", N, avg);
//   return 0;
// }
