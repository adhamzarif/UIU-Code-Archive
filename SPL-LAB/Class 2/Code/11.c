#include <stdio.h>

int main(void) {
  double in;
  scanf("%lf", &in);

  if (in >= 90 && in <= 100))
    printf("A");
  else if (in >= 86 && in <= 89)
    printf("A-");
  else if (in >= 82 && in <= 85)
    printf("B+");
  else if (in >= 78 && in <= 81)
    printf("B");
  else if (in >= 74 && in <= 77)
    printf("B-");
  else if (in >= 70 && in <= 73)
    printf("C+");
  else if (in >= 66 && in <= 69)
    printf("C");
  else if (in >= 62 && in <= 65)
    printf("C+");
  else if (in >= 58 && in <= 61)
    printf("D+");
  else if (in >= 55 && in <= 57)
    printf("D");
  else
    printf("F");

  return 0;
}
