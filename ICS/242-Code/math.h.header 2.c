#include<stdio.h>
#include<math.h>
int main()
{
    double x,y,r1;
    printf("enter x ,y=");
    scanf("%lf %lf",&x,&y);

    r1=pow(x,y);
    printf("%.2lf",r1);

    return 0;
}
