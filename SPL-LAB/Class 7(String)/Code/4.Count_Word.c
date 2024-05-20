#include <stdio.h>

int main(void) {

  char str[100];
  scanf("%[^\n]s", str);

  int count = 0;
  for (int i = 0; i < 100; i++) 
  {
    if (str[i] == '\0') 
    {
      count++;
      break;
    } 
    else if (str[i] == ' ' && str[i - 1] != ' ' && str[i + 1] != '\0')
    {
      count++;
    }
  }

  printf("%d", count);

  return 0;
}
