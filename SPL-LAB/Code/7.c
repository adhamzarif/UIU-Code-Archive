#include <stdio.h>

int main(void) {
  int i;
  char j;
  float k;

  printf("Ente value number: ");
  scanf("%d %c %f", &i, &j, &k);

  printf("The integer value is : %d\n", i);
  printf("The charecter value is : %c\n", j);
  printf("The float value is : %.6f\n", k);
  return 0;
}
