#include <stdio.h>

int main()
{
    int X, n1, n2, n3;
    int flag = 0;


    scanf("%d %d %d %d", &X, &n1, &n2, &n3);


    if (n1 != X)
    {
        printf("Wrong, 2 Chance(s) Left!\n");
    }
    else
    {
        printf("Right, Player-2 wins!\n");
        flag = 1;
    }


    if (!flag && n2 != X)
    {
        printf("Wrong, 1 Chance(s) Left!\n");
    }
    else if (!flag)
    {
        printf("Right, Player-2 wins!\n");
        flag = 1;
    }


    if (!flag && n3 != X)
    {
        printf("Wrong, 0 Chance(s) Left!\n");
        printf("Player-1 wins!\n");
    }
    else if (!flag)
    {
        printf("Right, Player-2 wins!\n");
    }

    return 0;
}

