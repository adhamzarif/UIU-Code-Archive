#include <stdio.h>

int main(void) {
  int i = 0, j, count = 0, palindrome = 1;
  char str1[100], str2[100];
  printf("Enter the string: ");
  scanf("%[^\n]s", str1);

  // Doing the reverse of the string
  while (str1[i] != '\0') {
    count++;
    i++;
  }

  for (j = 0, i = count - 1; i >= 0; i--, j++) {
    str2[j] = str1[i];
  }
  str2[j] = '\0';

  // Checking for palindrome
  for (i = 0; i < count; i++) {
    if (str1[i] != str2[i]) {
      palindrome = 0;
      break;
    }
  }
  if (palindrome == 1) {
    printf("The string is palindrome");
  } else {
    printf("The string is not palindrome");
  }

  return 0;
}
