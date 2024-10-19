#include<stdio.h>
int main()
{
     float r,pi=3.14159,Area;
     printf("Enter radius:");
     scanf("%f",&r);

     Area= pi*r*r;
     printf("The result is: %f\n",Area);

     return 0;
}
