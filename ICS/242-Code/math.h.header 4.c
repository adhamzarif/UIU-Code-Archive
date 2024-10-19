#include<stdio.h>
#include<math.h>
int main()
{
    double u,a,s,v;
    printf("enter u,a,s=");
    scanf("%lf %lf %lf",&u,&a,&s);

    v=sqrt(u*u+2*a*s);
    printf("V=%.2lf\n",v);
    return 0;
}
