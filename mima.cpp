#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
	printf("����������\n");
	char password[15];
	int i = 0;
	int count = 3;
	for (i = 0 ; i < 3; i++)
	{
		scanf("%s", password);
		if (strcmp(password, "990816") == 0)
		{
			printf("������ȷ\n");
			break;
		}
		else
		{
			count--;
			printf("�㻹�� %d�λ��� \n", count);

		}


	}

	system("pause");
	return 0;
}