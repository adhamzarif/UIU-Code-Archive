#include<stdio.h>
int main()
{
    float a;
    printf("enter value:");
    scanf("%f",&a);

    if(a>=0)
        printf("%f is a positive value",a);
    else
        printf("it is a negative value",a);
    return 0;
}
