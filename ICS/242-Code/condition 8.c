#include<stdio.h>
int main()
{
    int year;
    printf("take input:");
    scanf("%d",&year);

    if((year % 4 == 0 && year % 100 != 0 ) || ( year % 400 ==0))
        printf("yes\n");
    else
        printf("no\n");

    return 0;
}
