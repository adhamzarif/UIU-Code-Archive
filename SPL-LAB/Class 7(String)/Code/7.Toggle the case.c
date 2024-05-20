#include <stdio.h>

int main(void) {
  int i;
  char str[100];
  scanf("%[^\n]s", str);
  for (i = 0; str[i] != '\0'; i++) {
    if (str[i] >= 'A' && str[i] <= 'Z') {
      str[i] = str[i] - 'A' + 'a';
    } else if (str[i] >= 'a' && str[i] <= 'z') {
      str[i] = str[i] - 'a' + 'A';
    }
  }
  printf("%s", str);
  return 0;
}
