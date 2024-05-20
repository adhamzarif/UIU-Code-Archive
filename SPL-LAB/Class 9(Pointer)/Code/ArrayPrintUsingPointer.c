#include <stdio.h>
void reverse(int *q)
{
  printf("\nReverse of the array is\n");
  for(int i = 4; i >= 0; i--)
    {
      printf("p[%d] = %d\n", i, *(q+i));
    }
}

int main(void) {
  int a[5] = {1, 2, 3, 4, 5};
  printf("%d\n", a);
  printf("a[0] address is: %d\n", &a[0]);

  int *p = a; //*p = &a[0]

  printf("p address is: %d\n", p);

  printf("p[0] address is: %d\n", p[0]);

   printf("p[0] address is: %d\n", *(p+1)); //this is the same as p[0]
 printf("\n");
  for(int i = 0; i < 5; i++)
    {
      printf("a[%d] address is: %d\n", i, *(p+i));
    }

   printf("\n");

  reverse(p);

  return 0;
}
