#include <stdio.h>
char message(char x) {
  printf("Value received from main: %c", x);
  return x;
}
int main(void) {
  char m;
  scanf("%c", &m);
  message(m);
  return 0;
}
