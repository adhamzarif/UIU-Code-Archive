#include<stdio.h>
int main()
{
    int feet,inch;
    printf("enter the height:");
    scanf("%d",&inch);

    feet=inch/12;
    inch=inch%12;

    printf("%d feet %d inch\n",feet,inch);

    return 0;
}
