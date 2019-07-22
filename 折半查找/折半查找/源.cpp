#include<stdio.h>
#include<stdlib.h>
int BinarySearch(int arr[], int left, int right, int key)
{
	while (left <= right)
	{
		int mid = left + (right - left) / 2; 
		if (arr[mid] > key)
		{
			right = mid - 1;
		}
		else if (arr[mid] == key)
		{
			return mid;
		}
		else
		{
			left = mid + 1;
		}
	}
	return -1;
}
int main()
{
	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
	int len = sizeof(arr) / sizeof(arr[0]);
	int index = BinarySearch(arr, 0,len - 1, 5);
	if (index == 1)
	{
		printf("ц╩спур╣╫\n");
	}
	else
	{
		printf("%d\n", index);
	}
system("pause");
	return 0;
}
