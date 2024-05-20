//Check

#include <stdio.h>

int main() {
   char str[300];
   int freq[300];
   int i, max = 0, max_index = 0;

   printf("Enter the string: ");
   scanf("%[^\n]s", str);

   // Initialize all character frequencies to 0
   for (i = 0; i < 300; i++)
      freq[i] = 0;

   // Count frequency of all characters in the string
   for (i = 0; str[i] != '\0'; i++)
      freq[str[i]]++;

   // Find the character with maximum frequency
   for (i = 0; i < 300; i++) {
      if (freq[i] > max) {
         max = freq[i];
         max_index = i;
      }
   }

   printf("Maximum occurring character is '%c' appearing %d times\n", max_index, max);

   return 0;
}
