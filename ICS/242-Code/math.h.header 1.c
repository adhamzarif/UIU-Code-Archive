#include<stdio.h>
#include<math.h>
int main()
{
    double x,r1,r2;
    printf("enter x:");
    scanf("%lf",&x);

    r1=floor(x);
    r2=ceil(x);
    printf("floor=%.0lf\n",r1);
     printf("celling=%.0lf\n",r2);

    return 0;
}
