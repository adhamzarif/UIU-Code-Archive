#include <stdio.h>

int main() {
  int i, j;
  char str1[100], str2[100];
  scanf("%[^\n]s", str1);
  scanf(" %[^\n]s",
        str2); // Corrected scanf format specifier to skip leading whitespace

  int count = 0;
  int len1 = 0;
  int len2 = 0;

  // Calculate the lengths of the strings
  while (str1[len1] != '\0')
    len1++;
  while (str2[len2] != '\0')
    len2++;

  // Loop through str1
  for (i = 0; i <= len1 - len2; i++) {
    // Check if the substring starting from i matches str2
    int match = 1;
    for (j = 0; j < len2; j++) {
      if (str1[i + j] != str2[j]) {
        match = 0;
        break;
      }
    }
    if (match)
      count++;
  }

  printf("%d\n", count);

  return 0;
}
