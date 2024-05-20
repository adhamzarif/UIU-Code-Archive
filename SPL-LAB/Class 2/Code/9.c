#include <stdio.h>

int main(void) {
  char num;
  printf("Enter a number: ");
  scanf("%c", &num);
  if ((num >= 'a' && num <= 'z') || (num >= 'A' && num <= 'Z')) {
    printf("Alphabet");
  } else if (num >= '0' && num <= '9') {
    printf("Digit");
  } else {
    printf("Special Character");
  }
  return 0;
}
