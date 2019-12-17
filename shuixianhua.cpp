#include <stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
	int i = 0;
	int tmp;
	for (i = 0; i < 99999; i++)
	{
		int count = 0;
		int sum = 0;
		tmp = i;
		while (tmp != 0)
		{
			count++;
			tmp /= 10;//tmp=tmp/10
		}
		tmp = i;
		while (tmp != 0)
		{

			sum += pow((double)(tmp % 10), count);
			tmp = tmp / 10;
		}
		if (sum == i)
			printf("%d\n", i);

	}

	system("pause");
	return 0;
}