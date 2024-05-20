#include <stdio.h>

int main(void) {
  int i = 0, j, count = 0;
  char str1[100], str2[100];
  printf("Enter the string: ");
  scanf("%[^\n]s", str1);
  while (str1[i] != '\0') {
    count++;
    i++;
  }

  for (j = 0, i = count - 1; i >= 0; i--, j++) {
    str2[j] = str1[i];
  }
  str2[j] = '\0';

  printf("The reverse of the string is: %s", str2);
  return 0;
}
