#include<stdio.h>
int main()
{
    int meter,centimeter;
    printf("enter the height:");
    scanf("%d",&centimeter);

    meter=centimeter/100;
    centimeter=centimeter%100;

    printf("%d meter %d centiemer\n",meter,centimeter);

    return 0;
}
