#include<stdio.h>
#include<math.h>
int main()

{
    double x,r1,r2,r3;
    printf("enter x:");
    scanf("%lf",&x);
    r1=sin(x);
    r2=cos(x);
    r3=tan(x);
    printf("sine=%.2lf\n",r1);
       printf("cosine=%.2lf\n",r2);
          printf("tangent=%.2lf\n",r3);

    return 0;
}
